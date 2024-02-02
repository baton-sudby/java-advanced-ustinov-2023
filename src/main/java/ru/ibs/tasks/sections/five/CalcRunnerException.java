package ru.ibs.tasks.sections.five;

import ru.ibs.tasks.sections.five.calculator.CalculatorOOPException;
import ru.ibs.utils.Utils;

import java.util.InputMismatchException;

public class CalcRunnerException {

    /**
     * Здание №6_Обработка исключений
     */
    public void calculate() {
        CalculatorOOPException calculatorOOPException = new CalculatorOOPException();
        Utils utils = new Utils();
        System.out.println("\033[0;33mДетали задания:\033[0m\nДобавить обработку исключений в задание с ООП калькулятора." +
                "\nВвести 2 дробных числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’");
        System.out.println("Введите первое дробное число:");
        double firstNumber = utils.getDoubleException();
        System.out.println("Введите второе дробное число:");
        double secondNumber = utils.getDoubleException();
        System.out.println("Введите символ операции, которую программа должна выполнить (+,-,*,/)");
        char operation = utils.getLine().charAt(0);
        double result = 0.0;
        try {
            result = calculatorOOPException.makeCalculation(firstNumber, secondNumber, operation);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный символ: " + operation + ". Допустимые символы: ‘+’, ‘-’, ‘*’, ‘/’" +
                    "\nПопробуйте снова.");
            calculate();
        }
        System.out.printf("Результат задачи: %s " + operation + " %s = %.4f", firstNumber, secondNumber, result);
    }
}

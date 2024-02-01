package ru.ibs.tasks.sections.three.runner;

import ru.ibs.tasks.sections.three.calculator.CalculatorOOP;
import ru.ibs.utils.Utils;

public class CalcRunner {

    public void calculate() {
        CalculatorOOP calculatorOOP = new CalculatorOOP();
        Utils utils = new Utils();
        System.out.println("\033[0;33mДетали задания:\033[0m\nРеализовать калькулятор в стиле ООП" +
                "\nВвести 2 дробных числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’" +
                "\nВывести в консоль результат выполнения соответствующей арифметической операции.\n");
        System.out.println("Введите первое дробное число:");
        double firstNumber = utils.getDouble();
        System.out.println("Введите второе дробное число:");
        double secondNumber = utils.getDouble();
        System.out.println("Введите символ операции, которую программа должна выполнить (+,-,*,/)");
        char operation = utils.getLine().charAt(0);
        double result = 0.0;
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            result = calculatorOOP.makeCalculation(firstNumber, secondNumber, operation);
        } else {
            System.out.println("Вы ввели неверный символ: " + operation + "\nПопробуйте снова.");
            calculate();
        }
        System.out.printf("Результат задачи: %s " + operation + " %s = %.4f", firstNumber, secondNumber, result);
    }
}

package ru.ibs.tasks.sections.six;

import ru.ibs.tasks.sections.five.calculator.CalculatorOOPException;

import java.util.InputMismatchException;

public class CalcRunnerTest {

    public double calculate(double firstNumber, double secondNumber, char operation) {
        CalculatorOOPException calculatorOOPException = new CalculatorOOPException();
        double result = 0.0;
        try {
            result = calculatorOOPException.makeCalculation(firstNumber, secondNumber, operation);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели неверный символ: " + operation + ". Допустимые символы: ‘+’, ‘-’, ‘*’, ‘/’" +
                    "\nПопробуйте снова.");
            calculate(firstNumber, secondNumber, operation);
        }
        return result;
    }
}

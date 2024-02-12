package ru.ibs.tasks.sections.six;

import ru.ibs.tasks.sections.five.calculator.CalculatorOOPException;

public class CalcRunnerTest {

    public double calculate(double firstNumber, double secondNumber, char operation) {
        CalculatorOOPException calculatorOOPException = new CalculatorOOPException();
        return calculatorOOPException.makeCalculation(firstNumber, secondNumber, operation);
    }
}

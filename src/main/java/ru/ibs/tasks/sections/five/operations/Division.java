package ru.ibs.tasks.sections.five.operations;

public class Division implements Operation {
    @Override
    public Double performOperation(double firstValue, double secondValue) throws ArithmeticException {
        if (secondValue == 0) {
            throw new ArithmeticException();
        }
        return firstValue / secondValue;
    }
}

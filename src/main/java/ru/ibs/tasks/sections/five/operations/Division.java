package ru.ibs.tasks.sections.five.operations;

public class Division implements Operation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        return firstValue / secondValue;
    }
}

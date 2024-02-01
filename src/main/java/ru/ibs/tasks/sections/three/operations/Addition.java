package ru.ibs.tasks.sections.three.operations;

public class Addition implements Operation {
    @Override
    public Double performOperation(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}

package ru.ibs.tasks.sections.three.calculator;

import ru.ibs.tasks.sections.three.operations.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorOOP {
    private final Map<Character, Operation> operationMap = new HashMap<>();

    public CalculatorOOP() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation(double firstNumber, double secondNumber, char operation) {
        Operation calculateOperation = operationMap.get(operation);
        return calculateOperation.performOperation(firstNumber, secondNumber);
    }
}

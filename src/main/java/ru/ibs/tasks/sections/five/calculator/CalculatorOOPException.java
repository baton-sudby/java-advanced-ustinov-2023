package ru.ibs.tasks.sections.five.calculator;

import ru.ibs.tasks.sections.five.operations.*;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;

public class CalculatorOOPException {
    private final Map<Character, Operation> operationMap = new HashMap<>();

    public CalculatorOOPException() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation(double firstNumber, double secondNumber, char operation) throws InputMismatchException {
        Operation calculateOperation;
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            calculateOperation = operationMap.get(operation);
        } else {
            throw new InputMismatchException();
        }
        return calculateOperation.performOperation(firstNumber, secondNumber);
    }
}

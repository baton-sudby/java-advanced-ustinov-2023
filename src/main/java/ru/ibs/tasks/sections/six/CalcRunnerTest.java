package ru.ibs.tasks.sections.six;

import org.junit.jupiter.api.Assertions;
import ru.ibs.tasks.sections.five.calculator.CalculatorOOPException;

import java.util.InputMismatchException;

public class CalcRunnerTest {

    private int counter = 0;
    public double calculate(double firstNumber, double secondNumber, char operation) {
        CalculatorOOPException calculatorOOPException = new CalculatorOOPException();
        double result = 0.0;
        try {
            result = calculatorOOPException.makeCalculation(firstNumber, secondNumber, operation);
        } catch (InputMismatchException e) {
            checkOperationAndDivideByZero(firstNumber, secondNumber, operation, String.valueOf(operation));
        } catch (ArithmeticException e) {
            checkOperationAndDivideByZero(firstNumber, secondNumber, operation, String.valueOf(secondNumber));
        }
        return result;
    }

    private void checkOperationAndDivideByZero(double firstNumber, double secondNumber, char operation, String invalidValue) {
        while (counter < 10) {
            counter++;
            System.out.println("Вы ввели неверное значение: " + invalidValue + ", при выполнении операции: " + operation +
                    "\nПопробуйте снова.");
            calculate(firstNumber, secondNumber, operation);
        }
        Assertions.fail("Вы ввели неверный символ: " + invalidValue);
    }
}

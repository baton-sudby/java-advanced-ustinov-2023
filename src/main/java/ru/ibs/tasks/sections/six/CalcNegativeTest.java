package ru.ibs.tasks.sections.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

/**
 * Задание №7_Unit тесты
 */
public class CalcNegativeTest {
    private final CalcRunnerTest calcRunnerTest = new CalcRunnerTest();

    @Test
    public void addsTwoNumbersNegativeInvalidOperation() {
        Assertions.assertThrows(InputMismatchException.class, () -> calcRunnerTest.calculate(2.0, 8.0, ')'));
    }

    @Test
    public void subtractsTwoNumbersNegativeInvalidValue() {
        Assertions.assertThrows(NumberFormatException.class, () -> calcRunnerTest.calculate(2.0, Integer.parseInt("-"), '-'));
    }

    @Test
    public void dividesByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> calcRunnerTest.calculate(65.0, 0.0, '/'));
    }
}

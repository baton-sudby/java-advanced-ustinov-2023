package ru.ibs.tasks.sections.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Задание №7_Unit тесты
 */
public class CalcNegativeTest {
    private final CalcRunnerTest calcRunnerTest = new CalcRunnerTest();

    @Test
    public void addsTwoNumbersNegativeInvalidOperation() {
        Assertions.assertEquals(10.0, calcRunnerTest.calculate(2.0, 8.0, ')'),
                "Результат сложения не верный");
    }

    @Test
    public void subtractsTwoNumbersNegativeInvalidValue() {
        Assertions.assertEquals(10.0, calcRunnerTest.calculate(2.0, Integer.parseInt("-"), '-'),
                "Результат сложения не верный");
    }

    @Test
    public void dividesByZero() {
        Assertions.assertEquals(13.0, calcRunnerTest.calculate(65.0, 0.0, '/'),
                "Результат деления не верный");
    }
}

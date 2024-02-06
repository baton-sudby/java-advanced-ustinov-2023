package ru.ibs.tasks.sections.six;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Задание №7_Unit тесты
 */
public class CalcPositiveTest {
    private final CalcRunnerTest calcRunnerTest = new CalcRunnerTest();

    @Test
    public void addsTwoNumbers() {
        Assertions.assertEquals(10.0, calcRunnerTest.calculate(2.0, 8.0, '+'),
                "Результат сложения не верный");
    }

    @Test
    public void subtractsTwoNumbers() {
        Assertions.assertEquals(11.0, calcRunnerTest.calculate(20.0, 9.0, '-'),
                "Результат вычитания не верный");
    }

    @Test
    public void multipliesTwoNumbers() {
        Assertions.assertEquals(12.0, calcRunnerTest.calculate(6.0, 2.0, '*'),
                "Результат умножения не верный");
    }

    @Test
    public void dividesTwoNumbers() {
        Assertions.assertEquals(13.0, calcRunnerTest.calculate(65.0, 5.0, '/'),
                "Результат деления не верный");
    }

}

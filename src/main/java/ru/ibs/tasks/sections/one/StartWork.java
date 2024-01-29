package ru.ibs.tasks.sections.one;

import ru.ibs.utils.Utils;

/**
 * Раздел 1: Начало работы
 */
public class StartWork {


    /**
     * Задача №1_калькулятор
     */
    public void calculator() {
        Utils utils = new Utils();
        System.out.println("\033[0;33mДетали задания:\033[0m\n1. Ввести 2 дробных числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’" +
                "\n2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.\n");
        System.out.println("Введите первое целое число:");
        double firstNumber = utils.getDouble();
        System.out.println("Введите второе целое число:");
        double secondNumber = utils.getDouble();
        System.out.println("Введите символ операции, которую программа должна выполнить (+,-,*,/)");
        String operation = utils.getLine();
        double result;
        switch (operation) {
            case "+" :
                result = firstNumber + secondNumber;
                System.out.printf("Результат задачи: %s + %s = %.4f", firstNumber, secondNumber, result);
                break;
            case "-":
                result = firstNumber - secondNumber;
                System.out.printf("Результат задачи: %s - %s = %.4f", firstNumber, secondNumber, result);
                break;
            case "*":
                result = firstNumber * secondNumber;
                System.out.printf("Результат задачи: %s * %s = %.4f", firstNumber, secondNumber, result);
                break;
            case "/":
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                    System.out.printf("Результат задачи: %s / %s = %.4f", firstNumber, secondNumber, result);
                    break;
                } else {
                    System.out.println("Вы ввели 0. Попробуйте еще раз:");
                    calculator();
                }
                break;
            default:
                System.out.println("Вы ввели некорректное значение. Попробуйте снова:\n");
                calculator();
                break;
        }
    }
}

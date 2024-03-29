package ru.ibs.utils;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    private final Scanner scanner = new Scanner(System.in);

    public String getLine() {
        return scanner.nextLine();
    }

    public int getNumber() {
        String string = getLine();
        if (string.matches("-?\\d+")) {
            if (string.length() > 10) {
                System.out.println("Нельзя вводить числа длиной более 10 символов. Попробуйте снова: ");
                return getNumber();
            }
            return Integer.parseInt(string);
        } else {
            System.out.printf("Неверное значение '%s'. Программа принимает только целые числа. Попробуйте снова:\n", string);
            return getNumber();
        }
    }

    public double getDouble() {
        String string = getLine();
        if (string.matches("-?\\d+(\\.\\d+)?")) {
            if (string.length() > 15) {
                System.out.println("Нельзя вводить числа длиной более 15 символов. Попробуйте снова: ");
                return getDouble();
            }
            return Double.parseDouble(string);
        } else {
            System.out.printf("Неверное значение '%s'. Программа принимает только дробные числа, написанные через точку." +
                    " Попробуйте снова:\n", string);
            return getDouble();
        }
    }

    public double getDoubleException() {
        String string = getLine();
        try {
            return Double.parseDouble(string);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.printf("Неверное значение '%s'. Программа принимает только дробные числа, написанные через точку." +
                    " Попробуйте снова:\n", string);
            return getDoubleException();
        }
    }

    public String[] getStringArray() {
        System.out.println("Введите количество строк: ");
        String[] stringArray = new String[getNumber()];
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("Введите содержимое строки '%s': ", i + 1);
            stringArray[i] = getLine();
        }
        return stringArray;
    }

    public int getRandomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public int[] getRandomIntArray() {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomInt(-10, 10);
        }
        return array;
    }

    public void closeScanner() {
        scanner.close();
    }
}

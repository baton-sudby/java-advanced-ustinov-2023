package ru.ibs.utils;

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
            System.out.printf("Неверное значение '%s'. Программа принимает только дробные числа. Попробуйте снова:\n", string);
            return getDouble();
        }
    }
}

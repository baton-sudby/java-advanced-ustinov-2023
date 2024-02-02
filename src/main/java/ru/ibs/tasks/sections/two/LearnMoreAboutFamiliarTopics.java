package ru.ibs.tasks.sections.two;

import ru.ibs.utils.Utils;

import java.util.Arrays;

/**
 * Раздел 2: Подробнее о знакомых темах
 */
public class LearnMoreAboutFamiliarTopics {

    private final Utils utils = new Utils();

    /**
     * Задание №2_Операции калькулятора
     */
    public void findLongestString() {
        System.out.println("\033[0;34mВ этом задании нам нужно найти самую длинную строку.\033[0m");
        String[] stringArray = utils.getStringArray();
        String longestString = "";
        for (String s : stringArray) {
            if (longestString.length() < s.length()) {
                longestString = s;
            }
        }
        System.out.println("Самая длинная строка: " + longestString);
    }

    /**
     * Задание №3_Массивы
     */
    public void getMinPositiveAndMaxNegativeElement() {
        System.out.println("\033[0;33mДетали задания:\033[0m\n1. Сформировать массив со случайными числами " +
                "от 10 до -10. Размер массива 20." +
                "\n2. Нужно найти максимальный отрицательный и минимальный положительный элементы массива. " +
                "Поменять их местами.\n");
        int[] array = utils.getRandomIntArray();
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && (maxNegativeIndex == -1 || array[i] > array[maxNegativeIndex])) {
                maxNegativeIndex = i;
            }
            if (array[i] > 0 && (minPositiveIndex == -1 || array[i] < array[minPositiveIndex])) {
                minPositiveIndex = i;
            }
        }
        System.out.println("Оригинальный массив: " + Arrays.toString(array) +
                "\nМаксимальный отрицательный элемент массива: " + array[maxNegativeIndex] + ", его индекс: " + maxNegativeIndex +
                "\nМинимальный положительный элемент массива: " + array[minPositiveIndex] + ", его индекс: " + minPositiveIndex);
        temp = array[maxNegativeIndex];
        array[maxNegativeIndex] = array[minPositiveIndex];
        array[minPositiveIndex] = temp;
        System.out.println("Измененный массив: " + Arrays.toString(array));

    }
}

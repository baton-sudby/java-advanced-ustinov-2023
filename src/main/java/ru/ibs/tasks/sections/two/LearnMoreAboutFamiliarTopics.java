package ru.ibs.tasks.sections.two;

import ru.ibs.utils.Utils;

/**
 * Раздел 2: Подробнее о знакомых темах
 */
public class LearnMoreAboutFamiliarTopics {

    /**
     * Задание №2_Операции калькулятора
     */
    public void findLongestString() {
        Utils utils = new Utils();
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
}

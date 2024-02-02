package ru.ibs.tasks.sections.four;

import java.io.*;
import java.nio.file.Path;
import java.util.*;

/**
 * Задание №5_Коллекции
 */
public class WorkWithCollections {

    private final List<String> wordsList = new ArrayList<>();

    private void addTextFromFileToList() {
        File file = Path.of("src/main/resources/test.txt").toFile();
        try(FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
               wordsList.addAll(Arrays.asList(line.split(" ")));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void subTaskFive() {
        System.out.println("\033[0;33mДетали задания:\033[0m\n- Прочитать слова из файла" +
                "\n- Отсортировать в алфавитном порядке" +
                "\n- Посчитать сколько раз каждое слово встречается в файле" +
                "\n- Вывести статистику на консоль\n- Найти слово с максимальным количеством повторений" +
                "\n- Вывести на консоль это слово и сколько раз оно встречается в файле\n");
        addTextFromFileToList();
        System.out.println("Оригинальный массив: " + wordsList);
        Collections.sort(wordsList);
        System.out.println("Массив, отсортированный в алфавитном порядке: " + wordsList);
        System.out.println("Массив, отсортированный по количеству вхождений слова" + sortByAmount(wordsList));
        findWordWithMaximumNumberRepetitions(sortByAmount(wordsList));
    }


    private Map<String, Integer> sortByAmount(List<String> wordsList) {
        Map<String, Integer> sortedMap = new HashMap<>();
        for (String s : wordsList) {
            if (sortedMap.containsKey(s)) {
                sortedMap.replace(s, sortedMap.get(s) + 1);
            } else {
                sortedMap.put(s, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(sortedMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    private void findWordWithMaximumNumberRepetitions(Map<String, Integer> sortedMap) {
        int maxValue = 1;
        String maxKey = null;
        Map<String, Integer> tempMap = new HashMap<>();
        for (Map.Entry<String, Integer> value : sortedMap.entrySet()) {
            if (value.getValue() > maxValue) {
                maxValue = value.getValue();
                maxKey = value.getKey();
            }
        }
        tempMap.put(maxKey, maxValue);
        for (Map.Entry<String, Integer> value : sortedMap.entrySet()) {
            if (value.getValue() == maxValue) {
                System.out.println("Слово, которое встречается в массиве максимально количество раз: " + value.getValue() +
                        "\nКоличество вхождений слова: " + value.getKey());
            }
        }
    }
}

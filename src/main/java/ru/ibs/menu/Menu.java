package ru.ibs.menu;

import ru.ibs.tasks.sections.five.CalcRunnerException;
import ru.ibs.tasks.sections.four.WorkWithCollections;
import ru.ibs.tasks.sections.one.StartWork;
import ru.ibs.tasks.sections.three.runner.CalcRunner;
import ru.ibs.tasks.sections.two.LearnMoreAboutFamiliarTopics;
import ru.ibs.tasks.sections.two.gift.Gift;
import ru.ibs.utils.Utils;

public class Menu {

    Utils utils = new Utils();

    private int taskNumber;

    public void mainMenu() {
        System.out.println("\n\033[0;96mМеню выбора разделов.\033[0m" +
                "\n1.Начало работы.\n2.Подробнее о знакомых темах.\n3.ООП.\n4.Коллекции.\n5.Обработка исключений." +
                "\n7.\033[0;31mЗавершить работу приложения.\033[0m" +
                "\n\033[0;96mВведите цифру, соответствующую модулю, который вы хотите выбрать:\033[0m");
        int moduleNumber = utils.getNumber();
        switch (moduleNumber) {
            case 1:
                gettingStartedMenu();
                break;
            case 2:
                learnMoreAboutFamiliarTopicsMenu();
                break;
            case 3:
                oopMenu();
                break;
            case 4:
                collectionsMenu();
                break;
            case 5:
                exceptionsMenu();
                break;
            case 7:
                utils.closeScanner();
                System.out.println("Приложение заверило работу.");
                break;
            default:
                System.out.printf("Раздела под номером '%s' не существует. Попробуйте снова:\n", moduleNumber);
                mainMenu();
                break;
        }
    }

    /**
     * Меню раздела 'Начало работы'
     */
    private void gettingStartedMenu() {
        StartWork calc = new StartWork();
        System.out.println("\033[0;31m_____________________________________________________________________\033[0m\n" +
                "\033[0;96mМеню раздела 'Начало работы'.\033[0m" +
                "\n1.Калькулятор.\n2.\033[0;32mВыйти в меню выбора модулей.\033[0m");
        taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                calc.calculator();
                mainMenu();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. Попробуйте снова:\n", taskNumber);
                gettingStartedMenu();
                break;
        }
    }

    /**
     * Меню раздела 'Подробнее о знакомых темах'
     */
    private void learnMoreAboutFamiliarTopicsMenu() {
        LearnMoreAboutFamiliarTopics sectionTwo = new LearnMoreAboutFamiliarTopics();
        Gift gift = new Gift();
        System.out.println("\033[0;31m_____________________________________________________________________\033[0m\n" +
                "\033[0;96mМеню раздела 'Подробнее о знакомых темах'.\033[0m" +
                "\n1.Найти самую длинную сроку в массиве.\n2.Поменять местами максимальный отрицательный и " +
                "минимальный положительный элементы в массиве.\n3.Сладкий подарок\n\033[0;32mВыйти в меню выбора модулей.\033[0m");
        taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                sectionTwo.findLongestString();
                mainMenu();
                break;
            case 2:
                sectionTwo.getMinPositiveAndMaxNegativeElement();
                mainMenu();
                break;
            case 3:
                gift.printGift();
                mainMenu();
                break;
            case 4:
                mainMenu();
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. Попробуйте снова:\n", taskNumber);
                learnMoreAboutFamiliarTopicsMenu();
                break;
        }
    }

    /**
     * Меню раздела 'ООП'
     */
    private void oopMenu() {
        CalcRunner runner = new CalcRunner();
        System.out.println("\033[0;31m_____________________________________________________________________\033[0m\n" +
                "\033[0;96mМеню раздела 'ООП'.\033[0m\n1.Реализовать калькулятор в стиле ООП.\n" +
                "\033[0;32mВыйти в меню выбора модулей.\033[0m");
        taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                runner.calculate();
                mainMenu();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. Попробуйте снова:\n", taskNumber);
                learnMoreAboutFamiliarTopicsMenu();
                break;
        }
    }

    /**
     * Меню раздела 'Коллекции'
     */
    private void collectionsMenu() {
        WorkWithCollections withCollections = new WorkWithCollections();
        System.out.println("\033[0;31m_____________________________________________________________________\033[0m\n" +
                "\033[0;96mМеню раздела 'Коллекции'.\033[0m\n1.Сортировка слов прочитанных из файла.\n" +
                "\033[0;32mВыйти в меню выбора модулей.\033[0m");
        taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                withCollections.subTaskFive();
                mainMenu();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. Попробуйте снова:\n", taskNumber);
                collectionsMenu();
                break;
        }
    }

    /**
     * Меню раздела 'Исключения'
     */
    private void exceptionsMenu() {
        CalcRunnerException calcRunnerException = new CalcRunnerException();
        System.out.println("\033[0;31m_____________________________________________________________________\033[0m\n" +
                "\033[0;96mМеню раздела 'Исключения'.\033[0m\n1.Калькулятор, в котором ошибки обработаны с помощью Exceptions.\n" +
                "\033[0;32mВыйти в меню выбора модулей.\033[0m");
        taskNumber = utils.getNumber();
        switch (taskNumber) {
            case 1:
                calcRunnerException.calculate();
                mainMenu();
                break;
            case 2:
                mainMenu();
                break;
            default:
                System.out.printf("Задания под номером '%s' не существует. Попробуйте снова:\n", taskNumber);
                collectionsMenu();
                break;
        }
    }
}

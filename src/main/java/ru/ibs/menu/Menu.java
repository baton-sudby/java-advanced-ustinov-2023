package ru.ibs.menu;

import ru.ibs.tasks.sections.one.Calculator;
import ru.ibs.utils.Utils;

public class Menu {

    Utils utils = new Utils();

    private int taskNumber;

    public void mainMenu() {
        System.out.println("\n\033[0;96mМеню выбора разделов.\033[0m" +
                "\n1.Начало работы.\n7.\033[0;31mЗавершить работу приложения.\033[0m" +
                "\n\033[0;96mВведите цифру, соответствующую модулю, который вы хотите выбрать:\033[0m");
        int moduleNumber = utils.getNumber();
        switch (moduleNumber) {
            case 1:
                gettingStartedMenu();
                break;
            case 7:
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
        Calculator calc = new Calculator();
        System.out.println("\033[0;31m_______________________________________________________________________\033[0m\n" +
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
}

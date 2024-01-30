package ru.ibs.tasks.sections.two.gift.utils;

import ru.ibs.utils.Utils;

import static ru.ibs.tasks.sections.two.gift.constants.Const.*;

public class GiftUtils {

    private final Utils utils = new Utils();

    public int getRandomWeight() {
        return utils.getRandomInt(5, 50);
    }

    public int getRandomPrice() {
        return utils.getRandomInt(10, 100);
    }

    public String getRandomName(String candy) {
        switch (candy) {
            case "Caramel":
                return CARAMEL_NAME[(int)(Math.random() * CARAMEL_NAME.length)];
            case "Chocolate":
                return CHOCOLATE_NAME[(int)(Math.random() * CHOCOLATE.length)];
            case "Marmalade":
                return MARMALADE_NAME[(int)(Math.random() * MARMALADE_NAME.length)];
            default:
                System.out.println("Такой тип конфеты отсутствует: " + candy);
                break;
        }
        return "Несуществующая конфета " + candy;
    }

    public String getRandomTaste(String candy) {
        switch (candy) {
            case "Caramel":
                return CARAMEL[(int)(Math.random() * CARAMEL.length)];
            case "Chocolate":
                return CHOCOLATE[(int)(Math.random() * CHOCOLATE.length)];
            case "Marmalade":
                return MARMALADE[(int)(Math.random() * MARMALADE.length)];
            default:
                System.out.println("Такой тип конфеты отсутствует: " + candy);
                break;
        }
        return "Несуществующая конфета " + candy;
    }
}

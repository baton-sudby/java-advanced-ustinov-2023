package ru.ibs.tasks.sections.two.gift;

import ru.ibs.tasks.sections.two.gift.candy.Candy;
import ru.ibs.tasks.sections.two.gift.candy.Caramel;
import ru.ibs.tasks.sections.two.gift.candy.Chocolate;
import ru.ibs.tasks.sections.two.gift.candy.Marmalade;

public class Gift {


    /**
     * Задание №3_Массивы. Сладкий подарок
     */
    public void printGift() {
        Candy caramel = new Caramel();
        Candy chocolate = new Chocolate();
        Candy marmalade = new Marmalade();

        caramel = caramel.createCandy();
        chocolate = chocolate.createCandy();
        marmalade = marmalade.createCandy();

        Gift[] gift = {caramel, chocolate, marmalade};
        System.out.println("Состав подарка:");
        for (Gift candy: gift) {
            System.out.println(candy);
        }
        System.out.println(
                "Общий вес подарка: " + (caramel.getWeight() + chocolate.getWeight() + marmalade.getWeight()) + "гр\n" +
                "Общая стоимость подарка: " + (caramel.getPrice() + chocolate.getPrice() + marmalade.getPrice()) + "р");

    }
}

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

        double totalWeight = 0.0;
        double totalPrice = 0.0;
        Gift[] gift = {caramel, chocolate, marmalade};
        System.out.println("Состав подарка:");
        for (Gift candy: gift) {
            System.out.println(candy);
            totalWeight += candy.getWeight((Candy) candy);
            totalPrice += candy.getPrice((Candy) candy);
        }
        System.out.println(
                "Общий вес подарка: " + totalWeight + "гр\n" + "Общая стоимость подарка: " + totalPrice + "р");
    }

    private double getWeight(Candy candy) {
        return candy.getWeight();
    }

    private double getPrice(Candy candy) {
        return candy.getPrice();
    }
}

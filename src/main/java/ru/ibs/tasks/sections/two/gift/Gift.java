package ru.ibs.tasks.sections.two.gift;

import ru.ibs.tasks.sections.two.gift.candy.Candy;
import ru.ibs.tasks.sections.two.gift.candy.Caramel;
import ru.ibs.tasks.sections.two.gift.candy.Chocolate;
import ru.ibs.tasks.sections.two.gift.candy.Marmalade;
import ru.ibs.tasks.sections.two.gift.utils.GiftUtils;

public class Gift {


    /**
     * Задание №3_Массивы. Сладкий подарок
     */
    public void printGift() {
        GiftUtils giftUtils = new GiftUtils();
        String caramelName = "Caramel";
        String chocolateName = "Chocolate";
        String marmaladeName = "Marmalade";

        Candy caramel = new Caramel(giftUtils.getRandomWeight(), giftUtils.getRandomPrice(),
                giftUtils.getRandomName(caramelName), giftUtils.getRandomUniqueParameter(caramelName));
        Candy chocolate = new Chocolate(giftUtils.getRandomWeight(), giftUtils.getRandomPrice(),
                giftUtils.getRandomName(chocolateName), giftUtils.getRandomUniqueParameter(chocolateName));

        Marmalade marmalade = new Marmalade();
        marmalade.setName(giftUtils.getRandomName(marmaladeName));
        marmalade.setWeight(giftUtils.getRandomWeight());
        marmalade.setPrice(giftUtils.getRandomPrice());
        marmalade.setForm(giftUtils.getRandomUniqueParameter(marmaladeName));

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

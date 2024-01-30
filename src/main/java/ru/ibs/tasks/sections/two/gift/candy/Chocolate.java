package ru.ibs.tasks.sections.two.gift.candy;

import ru.ibs.tasks.sections.two.gift.utils.GiftUtils;

public class Chocolate extends Candy {
    private final GiftUtils giftUtils = new GiftUtils();
    private String taste;

    public Chocolate(int weight, int price, String name, String taste) {
        super(weight, price, name);
        this.taste = taste;
    }

    public Chocolate(){
    }

    @Override
    public String toString() {
        return "Chocolate{name= " + getName() + ", taste= " + taste + ", weight = " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }

    @Override
    public Candy createCandy() {
        String chocolateName = "Chocolate";
        return new Chocolate(giftUtils.getRandomWeight(), giftUtils.getRandomPrice(),
                giftUtils.getRandomName(chocolateName), giftUtils.getRandomUniqueParameter(chocolateName));
    }
}

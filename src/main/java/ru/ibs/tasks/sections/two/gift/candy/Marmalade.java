package ru.ibs.tasks.sections.two.gift.candy;

import ru.ibs.tasks.sections.two.gift.utils.GiftUtils;

public class Marmalade extends Candy {

    private final GiftUtils giftUtils = new GiftUtils();

    private String form;

    public Marmalade(int weight, int price, String name, String form) {
        super(weight, price, name);
        this.form = form;
    }

    public Marmalade(){
    }

    @Override
    public String toString() {
        return "Marmalade{name= " + getName() + ", form= " + form + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }

    @Override
    public Candy createCandy() {
        String marmaladeName = "Marmalade";
        return new Marmalade(giftUtils.getRandomWeight(), giftUtils.getRandomPrice(),
                giftUtils.getRandomName(marmaladeName), giftUtils.getRandomUniqueParameter(marmaladeName));
    }
}

package ru.ibs.tasks.sections.two.gift.candy;

import ru.ibs.tasks.sections.two.gift.utils.GiftUtils;

public class Caramel extends Candy {
    private final GiftUtils giftUtils = new GiftUtils();
    private String type;

    public Caramel(int weight, int price, String name, String type) {
        super(weight, price, name);
        this.type = type;
    }

    public Caramel(){
    }

    @Override
    public String toString() {
        return "Caramel{name= " + getName() + ", type= " + type + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }

    @Override
    public Candy createCandy() {
        String caramelName = "Caramel";
        return new Caramel(giftUtils.getRandomWeight(), giftUtils.getRandomPrice(),
                giftUtils.getRandomName(caramelName), giftUtils.getRandomUniqueParameter(caramelName));
    }
}

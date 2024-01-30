package ru.ibs.tasks.sections.two.gift.candy;

public class Caramel extends Candy {
    private final String type;

    public Caramel(int weight, int price, String name, String type) {
        super(weight, price, name);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Caramel{name= " + getName() + ", type= " + type + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }
}

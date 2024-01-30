package ru.ibs.tasks.sections.two.gift.candy;

public class Caramel extends Candy {

    private final String taste;

    public Caramel(int weight, int price, String name, String taste) {
        super(weight, price, name);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Caramel{name= " + getName() + ", taste= " + taste + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }
}

package ru.ibs.tasks.sections.two.gift.candy;

public class Chocolate extends Candy {
    private final String taste;

    public Chocolate(int weight, int price, String name, String taste) {
        super(weight, price, name);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Chocolate{name= " + getName() + ", taste= " + taste + ", weight = " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }
}

package ru.ibs.tasks.sections.two.gift.candy;

public class Marmalade extends Candy {

    private String taste;

    public Marmalade(){
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Marmalade{name= " + getName() + ", taste= " + taste + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }
}

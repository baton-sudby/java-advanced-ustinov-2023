package ru.ibs.tasks.sections.two.gift.candy;

import ru.ibs.tasks.sections.two.gift.Gift;

public abstract class Candy extends Gift {
    private int weight;
    private int price;
    private String name;

    public Candy(int weight, int price, String name) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }

    public Candy(){
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

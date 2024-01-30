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


    public int getPrice() {
        return price;
    }


    public String getName() {
        return name;
    }


    public abstract Candy createCandy();
}

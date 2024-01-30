package ru.ibs.tasks.sections.two.gift.candy;

public class Marmalade extends Candy {

    private String form;

    public Marmalade(){
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Marmalade{name= " + getName() + ", form= " + form + ", weight= " + getWeight() + "гр, price= " +
                getPrice() + "р}";
    }
}

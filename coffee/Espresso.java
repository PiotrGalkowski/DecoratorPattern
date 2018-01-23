package com.dev30plus.coffee;

public class Espresso extends Drink {

    public Espresso() {
        this.description =  "Kawa Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

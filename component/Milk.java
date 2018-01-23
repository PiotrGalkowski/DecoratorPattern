package com.dev30plus.component;

import com.dev30plus.coffee.Drink;

public class Milk extends ComponentDecorator {

    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Mleko";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.10;
    }
}

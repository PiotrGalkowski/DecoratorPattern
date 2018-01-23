package com.dev30plus.component;

import com.dev30plus.coffee.Drink;

public class Chocolate extends ComponentDecorator {

    private Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Czekolada";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.20;
    }
}

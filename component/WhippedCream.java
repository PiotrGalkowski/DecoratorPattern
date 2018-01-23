package com.dev30plus.component;

import com.dev30plus.coffee.Drink;

public class WhippedCream extends ComponentDecorator {

    private Drink drink;

    public WhippedCream(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Bita Smietana";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.10;
    }
}

package com.dev30plus.component;

import com.dev30plus.coffee.Drink;

public class SoyaBeanMilk extends ComponentDecorator {

    private Drink drink;

    public SoyaBeanMilk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Mleczko Sojowe";
    }

    @Override
    public double cost() {
        return drink.cost() + 0.15;
    }
}

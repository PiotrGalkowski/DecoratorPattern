package com.dev30plus.coffee;

public class StronglyBurned extends Drink{

    public StronglyBurned() {
        this.description = "Kawa Mocno Palona";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}

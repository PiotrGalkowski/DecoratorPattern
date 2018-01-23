package com.dev30plus.coffee;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        this.description = "Kawa Star Cafe Special";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

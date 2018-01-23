package com.dev30plus.coffee;



public class Decaff extends Drink{

    public Decaff() {
        this.description = "Kawa bezkofeinowa";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

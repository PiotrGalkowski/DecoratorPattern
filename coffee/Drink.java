package com.dev30plus.coffee;

public abstract class Drink {

    String description = "Napój nieznany";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

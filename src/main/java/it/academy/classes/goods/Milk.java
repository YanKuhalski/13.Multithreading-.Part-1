package it.academy.classes.goods;

import it.academy.Good;

public class Milk implements Good {
    private int paraice = 20;
    private String name = "Молоко";

    @Override
    public String print() {
        return " " + name + " - " + paraice + ",";
    }
}


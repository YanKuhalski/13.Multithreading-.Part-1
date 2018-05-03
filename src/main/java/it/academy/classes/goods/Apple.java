package it.academy.classes.goods;

import it.academy.Good;

public class Apple implements Good {
    private int paraice = 5;
    private String name = "Яблоко";

    @Override
    public String print() {
        return " " + name + " - " + paraice + ",";
    }
}

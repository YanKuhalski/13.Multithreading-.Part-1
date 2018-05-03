package it.academy.classes.goods;

import it.academy.Good;

public class Beer implements Good {
    private int paraice = 30;
    private String name = "Пиво";

    @Override
    public String print() {
        return " " + name + " - " + paraice + ",";
    }
}

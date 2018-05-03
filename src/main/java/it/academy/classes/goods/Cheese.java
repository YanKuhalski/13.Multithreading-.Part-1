package it.academy.classes.goods;

import it.academy.Good;

public class Cheese implements Good {
    private int paraice = 15;
    private String name = "Сыр";

    @Override
    public String print() {
        return " " + name + " - " + paraice + ",";
    }
}

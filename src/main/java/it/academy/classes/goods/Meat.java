package it.academy.classes.goods;

import it.academy.Good;

public class Meat implements Good {
    private int paraice = 35;
    private String name = "Мясо";

    @Override
    public String print() {
        return " " + name + " - " + paraice + ",";
    }
}

package it.academy;

import it.academy.classes.CashPoint;
import it.academy.classes.Customer;
import it.academy.classes.CustomerQueue;
import it.academy.classes.goods.*;

public class Main {
    public static void main(String[] args) {
        CustomerQueue customerQueue = new CustomerQueue()
                .addCustomer(new Customer()
                        .addGood(new Cheese())
                        .addGood(new Milk()))
                .addCustomer(new Customer()
                        .addGood(new Milk())
                        .addGood(new Cheese())
                        .addGood(new Apple()))
                .addCustomer(new Customer()
                        .addGood(new Milk())
                        .addGood(new Apple())
                        .addGood(new Meat()))
                .addCustomer(new Customer()
                        .addGood(new Beer()));

        CashPoint cashPoint =new CashPoint(customerQueue);
        cashPoint.serve();

    }
}

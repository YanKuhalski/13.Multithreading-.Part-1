package it.academy.classes;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerQueue {
    private Queue<Customer> customerQueue = new LinkedList<>();

    public CustomerQueue addCustomer(Customer customer) {
        customerQueue.add(customer);
        return this;
    }

    public Customer getCustomer() {
        return customerQueue.poll();
    }


}


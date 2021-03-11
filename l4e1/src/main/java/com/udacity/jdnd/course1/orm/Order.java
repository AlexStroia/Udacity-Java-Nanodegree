package com.udacity.jdnd.course1.orm;

public class Order {
    final int id;
    final int customer_id;

    public Order(int id, int customer_id) {
        this.id = id;
        this.customer_id = customer_id;
    }

    public int getId() {
        return id;
    }

    public int getCustomer_id() {
        return customer_id;
    }
}

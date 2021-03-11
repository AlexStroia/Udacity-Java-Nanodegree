package com.udacity.jdnd.course1.orm;

public class TacoOrder {
    final int order_id;
    final String taco_name;
    final String taco_price;
    final int count;

    public TacoOrder(int order_id, String taco_name, String taco_price, int count) {
        this.order_id = order_id;
        this.taco_name = taco_name;
        this.taco_price = taco_price;
        this.count = count;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getTaco_name() {
        return taco_name;
    }

    public String getTaco_price() {
        return taco_price;
    }

    public int getCount() {
        return count;
    }
}

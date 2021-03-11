package com.udacity.jdnd.course1.orm;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Delivery {
    final int id;
    final int order_id;
    final Timestamp time;

    public Delivery(int id, int order_id, Timestamp time) {
        this.id = id;
        this.order_id = order_id;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public Timestamp getTime() {
        return time;
    }
}

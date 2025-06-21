package com.pluralsight.springboot.ticket.events;

import java.math.BigDecimal;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private int eventId;

    public Product(int id, String name, BigDecimal price, int eventId) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.eventId = eventId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getEventId() {
        return eventId;
    }
}

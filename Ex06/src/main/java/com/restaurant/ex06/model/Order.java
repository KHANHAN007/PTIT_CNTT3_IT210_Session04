package com.restaurant.ex06.model;

public class Order {
    private Long id;
    private String name;

    public Order(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
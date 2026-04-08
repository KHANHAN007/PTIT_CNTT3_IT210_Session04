package com.restaurant.ex06.repository;

import com.restaurant.ex06.model.Order;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class OrderRepository {
    private final Map<Long, Order> data = new HashMap<>();

    public OrderRepository() {
        data.put(1L, new Order(1L, "Bún bò"));
        data.put(2L, new Order(2L, "Cơm tấm"));
    }

    public Order findById(Long id) {
        return data.get(id);
    }

    public void save(Order order) {
        data.put(order.getId(), order);
    }

    public void delete(Long id) {
        data.remove(id);
    }
}
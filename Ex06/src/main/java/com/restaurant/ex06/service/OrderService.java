package com.restaurant.ex06.service;

import com.restaurant.ex06.model.Order;
import com.restaurant.ex06.repository.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    public Order getById(Long id) {
        return repo.findById(id);
    }

    public String create(Long id, String name) {
        repo.save(new Order(id, name));
        return "Tạo đơn hàng thành công";
    }

    public String delete(Long id) {
        repo.delete(id);
        return "Đã hủy đơn hàng " + id;
    }
}
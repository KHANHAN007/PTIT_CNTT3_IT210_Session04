package com.restaurant.ex06.controller;
import com.restaurant.ex06.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bai5/orders")
public class OrderController {
    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public String getOrder(@PathVariable Long id) {
        var order = service.getById(id);
        if (order == null) return "Không tìm thấy đơn";
        return "Đơn: " + order.getName();
    }

    @PostMapping
    public String createOrder(@RequestParam Long id, @RequestParam String name) {
        return service.create(id, name);
    }

    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable Long id) {
        return service.delete(id);
    }
}
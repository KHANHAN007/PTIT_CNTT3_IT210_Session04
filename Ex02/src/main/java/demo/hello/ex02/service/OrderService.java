package demo.hello.ex02.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public String getAllOrders() {
        return "Danh sách tất cả đơn hàng";
    }

    public String getOrderById(Long id) {
        return "Thông tin đơn hàng với ID = " + id;
    }
}
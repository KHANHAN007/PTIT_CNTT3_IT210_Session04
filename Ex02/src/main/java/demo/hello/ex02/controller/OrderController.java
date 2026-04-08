package demo.hello.ex02.controller;
import demo.hello.ex02.service.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("demo.hello.ex02")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public String getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }
}
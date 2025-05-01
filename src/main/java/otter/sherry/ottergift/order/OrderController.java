package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("")
    public void orderRegister(@RequestBody OrderEntity orderEntity) {
        orderService.orderRegister(orderEntity);
    }

    @GetMapping("/{orderId}")
    public OrderEntity getOrder(@PathVariable Integer orderId) {
        return orderService.getOrderById(orderId);
    }
    @GetMapping("/all")
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }
}

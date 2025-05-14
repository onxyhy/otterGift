package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("")
    public void orderRegister(@RequestParam("userId") Long userId,@RequestParam("productId") Long productId) {
        //System.out.println(userId.toString() + productId.toString());
        orderService.orderRegister(userId, productId);
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

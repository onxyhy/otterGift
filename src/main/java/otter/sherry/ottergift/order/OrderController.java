package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping("")
    public void orderRegister(@RequestBody OrderEntity orderEntity) {
        orderService.orderRegister(orderEntity);
    }
}

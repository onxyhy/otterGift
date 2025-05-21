package otter.sherry.ottergift.order;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("")
    public void orderRegister(
            @RequestParam("userId") Long userId,
            @RequestParam("productId") Long productId) {
        //System.out.println(userId.toString() + productId.toString());
        orderService.orderRegister(userId, productId);
    }

    @GetMapping("/{orderId}")
    @Operation(summary = "주문조회", description = "주문 하나를 조회합니다.")
    public OrderEntity getOrder(
            @Parameter(required = true,description = "주문 하나를 조회합니다.")
            @PathVariable("orderId") Integer orderId) {
        return orderService.getOrderById(orderId);
    }
    @Operation(summary = "주문 모두 조회", description = "주문 전체를 조회합니다.")
    @GetMapping("/all")
    public List<OrderEntity> getAllOrders() {
        return orderService.getAllOrders();
    }
}

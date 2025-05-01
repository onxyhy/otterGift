package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void orderRegister(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }

    public OrderEntity getOrderById(long orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }

    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
}

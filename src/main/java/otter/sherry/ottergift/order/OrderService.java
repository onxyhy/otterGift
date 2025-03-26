package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public void orderRegister(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }
}

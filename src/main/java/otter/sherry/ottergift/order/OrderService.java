package otter.sherry.ottergift.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import otter.sherry.ottergift.product.ProductEntity;
import otter.sherry.ottergift.product.ProductRepository;
import otter.sherry.ottergift.user.UserEntity;
import otter.sherry.ottergift.user.UserRepository;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public void orderRegister(Long userId, Long productId) {
        // 1. User 조회
        UserEntity user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + userId));

        // 2. Product 조회
        ProductEntity product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found with id: " + productId));

        // 3. 재고 확인
        if (product.getStockNumber() <= 0) {
            throw new IllegalArgumentException("Insufficient stock for product: " + product.getProductName());
        }

        // 4. Order 생성 (User 설정)
        OrderEntity order = new OrderEntity();
        order.setUser(user);
        order.setProductCount(1); // 기본적으로 1개로 설정
        order.setReceipt(true);
        order.setCardAPI(true);
        order.setDeliveryCompany("Default Delivery");
        order.setAddress("Default Address");

        // 5. Order 저장 (Entity 저장 후 변수에 저장)
        OrderEntity savedOrder = orderRepository.save(order);

        // 6. Product에 저장된 Order를 추가
        if (product.getOrders() != null) {
            product.getOrders().add(savedOrder);
        }

        // 7. Product 재고 감소
        product.setStockNumber(product.getStockNumber() - 1);
        productRepository.save(product);
    }
    // Order 조회
    public OrderEntity getOrderById(Integer orderId) {
        return orderRepository.findById(Long.valueOf(orderId))
                .orElseThrow(() -> new IllegalArgumentException("Order not found with id: " + orderId));
    }

    // 모든 Order 조회
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
}

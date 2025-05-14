package otter.sherry.ottergift.order;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.product.ProductEntity;
import otter.sherry.ottergift.user.UserEntity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long orderId;

    // Order와 User의 관계 (다대일)
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserEntity user;

    // Order와 Product의 관계 (다대일)
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductEntity product; // Product 필드 추가

    // 주문 수량
    private int productCount;

    // 결제 정보
    private boolean isReceipt;
    private boolean isCardAPI;

    // 배송 정보 (간단한 형태)
    private String deliveryCompany;
    private String address;
}

package otter.sherry.ottergift.product;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.order.OrderEntity;
import otter.sherry.ottergift.user.UserEntity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;
    int price;
    int category;
    int stockNumber;
    String productName;
    String productDescription;
    String categoryName;
    String productImage;
    String productStatus; //품절이 될 수도 있음
    boolean deleted;
    boolean inStock;
    boolean available;
    @ManyToOne
    @JoinColumn(name = "userId")
    UserEntity user;
    @ManyToOne
    @JoinColumn(name = "orderId")
    OrderEntity order;
}

package otter.sherry.ottergift.product;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.order.OrderEntity;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private int price;
    private int category;
    private int stockNumber;
    private String productName;
    private String productDescription;
    private String categoryName;
    private String productImage;
    private String productStatus; // 품절 가능성
    private boolean deleted;
    private boolean inStock;
    private boolean available;

    //  Product는 여러 Order에서 사용될 수 있음 (1:N)
    @OneToMany(mappedBy = "product")
    private List<OrderEntity> orders;
}

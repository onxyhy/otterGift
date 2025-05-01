package otter.sherry.ottergift.order;

import jakarta.persistence.*;
import otter.sherry.ottergift.product.ProductEntity;
import otter.sherry.ottergift.user.UserEntity;

import java.util.List;

@Entity
public class OrderEntity {
    @Id
    int orderId;
    int productId;
    int productCount;
    int deliveryId;
    boolean receipt;
    boolean cardAPI;
    String deliveryCompany;
    String address;
    @ManyToOne
    @JoinColumn(name = "userId")
    UserEntity user;
    @OneToMany(mappedBy = "order")
    List<ProductEntity> products;
}

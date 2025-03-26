package otter.sherry.ottergift.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import otter.sherry.ottergift.user.UserEntity;

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
}

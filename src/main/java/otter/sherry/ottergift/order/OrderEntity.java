package otter.sherry.ottergift.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import otter.sherry.ottergift.Users.UsersEntity;

@Entity
public class OrderEntity {
    @Id
    int orderId;
    int userId;
    int productId;
    int productCount;
    int deliveryId;
    boolean receipt;
    boolean cardAPI;
    String deliveryCompany;
    String address;
    @ManyToOne
    @JoinColumn(name = "userId")
    UsersEntity user;
}

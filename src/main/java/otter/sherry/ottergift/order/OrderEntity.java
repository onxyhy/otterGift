package otter.sherry.ottergift.order;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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
}

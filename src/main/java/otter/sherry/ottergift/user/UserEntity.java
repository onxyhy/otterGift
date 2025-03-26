package otter.sherry.ottergift.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import otter.sherry.ottergift.order.OrderEntity;
import otter.sherry.ottergift.product.ProductEntity;
import otter.sherry.ottergift.cs.CSEntity;

import java.util.Date;
import java.util.List;

@Entity
public class UserEntity {

    @Id
    int userId;
    int userType;
    String userNickName;
    String id;
    String userPassword;

    Date userBirthday;
    Date userRegistrationDate;
    Date userPurchaseDate;
    @OneToMany(mappedBy = "user")
    List<OrderEntity> orders;

    @OneToMany(mappedBy = "user")
    List<ProductEntity> products;

    @OneToMany(mappedBy = "user")
    List<CSEntity> services;
}

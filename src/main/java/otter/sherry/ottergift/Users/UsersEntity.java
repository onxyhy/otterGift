package otter.sherry.ottergift.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import otter.sherry.ottergift.order.OrderEntity;
import otter.sherry.ottergift.products.ProductEntity;
import otter.sherry.ottergift.service.ServiceEntity;

import java.util.Date;
import java.util.List;

@Entity
public class UsersEntity {

    @Id
    int userId;
    int userType;
    String userNickName;
    String userPassword;
    Date userBirthday;
    Date userRegistrationDate;
    Date userPurchaseDate;
    @OneToMany(mappedBy = "userId")
    List<OrderEntity> orders;

    @OneToMany(mappedBy = "userId")
    List<ProductEntity> products;

    @OneToMany(mappedBy = "userId")
    List<ServiceEntity> services;
}

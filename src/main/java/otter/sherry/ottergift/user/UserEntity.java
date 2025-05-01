package otter.sherry.ottergift.user;

import jakarta.persistence.*;
import lombok.*;
import otter.sherry.ottergift.order.OrderEntity;
import otter.sherry.ottergift.product.ProductEntity;
import otter.sherry.ottergift.cs.CSEntity;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    @Override
    public String toString() {
        return "id" + id + " userNickname : " + userNickName + " userPassword : " + userPassword + " userBirthday : " + userBirthday;
    }
}
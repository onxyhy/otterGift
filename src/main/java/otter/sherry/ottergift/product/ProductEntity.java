package otter.sherry.ottergift.product;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import otter.sherry.ottergift.user.UserEntity;

@Entity
public class ProductEntity {
    @Id
    int productId;
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
}

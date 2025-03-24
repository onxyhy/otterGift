package otter.sherry.ottergift.products;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
    @Id
    int productId;
    int userId;
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

}

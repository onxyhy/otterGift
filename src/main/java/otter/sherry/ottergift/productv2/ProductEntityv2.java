package otter.sherry.ottergift.productv2;
import jakarta.persistence.*;

@Entity
public class ProductEntityv2{
    @Id
    Long productId;
    int price;
    int stock;
    String name;
}
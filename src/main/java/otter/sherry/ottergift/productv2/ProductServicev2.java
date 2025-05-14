package otter.sherry.ottergift.productv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import otter.sherry.ottergift.product.ProductEntity;

@Service
public class ProductServicev2{
    @Autowired
    ProductRepositoryv2 productRepositoryv2;

    public ProductEntityv2 getProductInfo(Long productId){
        return productRepositoryv2.findById(productId).get();
    }
}
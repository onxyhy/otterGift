package otter.sherry.ottergift.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void productRegister(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
    public ProductEntity getProductById(Long productId) {
        return productRepository.findById(productId).orElse(null);
    }

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }
}

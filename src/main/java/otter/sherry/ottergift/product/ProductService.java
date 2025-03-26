package otter.sherry.ottergift.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void productRegister(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
}

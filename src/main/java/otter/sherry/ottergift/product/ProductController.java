package otter.sherry.ottergift.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("")
    public void productRegister(@RequestBody ProductEntity productEntity){
        productService.productRegister(productEntity);
    }

    @GetMapping("/{productId}")
    public ProductEntity getProduct(@PathVariable long productId) {
        return productService.getProductById(productId);
    }
    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

}

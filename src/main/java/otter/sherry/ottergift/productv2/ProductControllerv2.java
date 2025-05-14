package otter.sherry.ottergift.productv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductControllerv2 {
    @Autowired
    ProductServicev2 productServicev2;

    @GetMapping("/productv2/{productId}")
    public ProductEntityv2 getProductv2(@PathVariable("productId") Long productId){
        ProductEntityv2 productEntityv2 = productServicev2.getProductInfo(productId);
        return productEntityv2;
    }
}
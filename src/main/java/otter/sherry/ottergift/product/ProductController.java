package otter.sherry.ottergift.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @PostMapping("")
    public void productRegister(@RequestBody ProductEntity productEntity){
        productService.productRegister(productEntity);
    }
}

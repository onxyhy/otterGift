package otter.sherry.ottergift.product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
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
    @Operation(summary = "상품조회",description = "상품 하나를 조회합니다.")
    public ProductEntity getProduct(
            @Parameter(required = true/*반드시 입력창에 입력해야 한다*/, description = "상품 하나를 조회합니다.")
            @PathVariable("productId") long productId) {
        return productService.getProductById(productId);
    }
    @Operation(summary = "상품 모두 조회", description = "상품 전체를 조회합니다.")
    @GetMapping("/all")
    public List<ProductEntity> getAllProducts() {
        return productService.getAllProducts();
    }

}

package com.springboot.pos.controller;

import com.springboot.pos.entity.Product;
import com.springboot.pos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<Product> getProduct(){
        return productService.getProduct();
    }

    @PostMapping
    public List<Product> registerNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
        return productService.getProduct();
    }
}

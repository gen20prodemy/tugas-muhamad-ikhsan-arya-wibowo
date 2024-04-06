package com.springboot.pos.controller;

import com.springboot.pos.entity.Product;
import com.springboot.pos.service.AsyncService;
import com.springboot.pos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;
    private final AsyncService asyncService;

    @Autowired
    public ProductController(ProductService productService, AsyncService asyncService){
        this.productService = productService;
        this.asyncService = asyncService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() throws InterruptedException {
         List<Product> product = productService.getProduct();
         asyncService.asyncTriggered1();
         asyncService.asyncTriggered2();
         asyncService.asyncTriggered3();
         asyncService.asyncTriggered4();
         asyncService.asyncTriggered5();
         return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) throws IllegalAccessException {
        return productService.getProductById(id);
    }

    @PostMapping
    public List<Product> registerNewProduct(@RequestBody Product product) throws InterruptedException {
        productService.addNewProduct(product);
        return productService.getProduct();
    }

    @DeleteMapping(path = "{productId}")
    public List<Product> deleteProduct(@PathVariable("productId") Long productId) throws IllegalAccessException, InterruptedException {
        productService.deleteProduct(productId);
        return productService.getProduct();
    }
}

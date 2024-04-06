package com.springboot.pos.controller;

import com.springboot.pos.entity.Product;
import com.springboot.pos.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() throws InterruptedException {
         List<Product> product = productService.getProduct();
         return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/native/{id}")
    public Optional<Product> getProductByIdNative(@PathVariable("id") Long id) throws IllegalAccessException{
        return productService.getProductByIdNative(id);
    }
    @GetMapping("/native/category/{category_id}")
    public Optional<Product> getProductByCategoryJPQL(@PathVariable("category_id") Integer category){
        return productService.getProductByCategoryJPQL(category);
    }

    @GetMapping("{id}")
    public Optional<Product> getProductById(@PathVariable("id") Long id) throws IllegalAccessException {
        return productService.getProductById(id);
    }

    @PostMapping
    public List<Product> registerNewProduct(@RequestBody Product product) {
        productService.addNewProduct(product);
        return productService.getProduct();
    }

    @DeleteMapping(path = "{productId}")
    public List<Product> deleteProduct(@PathVariable("productId") Long productId) throws IllegalAccessException {
        productService.deleteProduct(productId);
        return productService.getProduct();
    }
}

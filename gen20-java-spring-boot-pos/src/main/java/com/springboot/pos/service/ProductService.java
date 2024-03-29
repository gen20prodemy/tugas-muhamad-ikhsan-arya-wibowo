package com.springboot.pos.service;

import com.springboot.pos.entity.Product;
import com.springboot.pos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct(){
        return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }
}

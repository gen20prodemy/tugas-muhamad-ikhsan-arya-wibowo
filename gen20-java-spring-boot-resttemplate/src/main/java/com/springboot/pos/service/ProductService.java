package com.springboot.pos.service;

import com.springboot.pos.entity.Product;
import com.springboot.pos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProduct() {
        return productRepository.findAllByOrderByIdAsc();
    }

    public Optional<Product> getProductById(Long id) throws IllegalAccessException {
        boolean exist = productRepository.existsById(id);
        if (!exist){
            throw new IllegalAccessException("product by id " + id + " does not exist");
        }
        return productRepository.findById(id);
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }


    public void deleteProduct(Long productId) throws IllegalAccessException {
        boolean exist = productRepository.existsById(productId);
        if(!exist){
            throw new IllegalAccessException("product by id " + productId + " does not exist");
        }
        productRepository.deleteById(productId);
    }
}

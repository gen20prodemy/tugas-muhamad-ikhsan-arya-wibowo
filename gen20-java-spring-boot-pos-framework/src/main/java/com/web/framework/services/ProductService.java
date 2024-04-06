package com.web.framework.services;

import com.web.framework.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product(1, "Sapu lidi", 12, 15000),
            new Product(2, "Ember Cat", 10, 20000),
            new Product(3, "Keset Toilet", 8, 35000),
            new Product(4, "Amplop Coklat", 32, 5000),
            new Product(5, "Lampu Pijar", 6, 67000),
            new Product(6, "Kaca Pembesar", 11, 32000)
    );

    public List<Product> findAll(){
            return products;
    }
}


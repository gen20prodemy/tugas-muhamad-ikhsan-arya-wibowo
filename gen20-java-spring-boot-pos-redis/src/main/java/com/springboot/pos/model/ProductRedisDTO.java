package com.springboot.pos.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@NoArgsConstructor
@RedisHash("Product")
public class ProductRedisDTO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int stock;
    private int price;

    public ProductRedisDTO(String name, int stock, int price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}

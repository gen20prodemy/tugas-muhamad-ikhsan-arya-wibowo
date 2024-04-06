package com.springboot.pos.repository;

import com.springboot.pos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByOrderByIdAsc();

//    @Query("SELECT p FROM Product p WHERE p.category = ?")
//    List<Product> findProductByCategoryId(Integer category);

}

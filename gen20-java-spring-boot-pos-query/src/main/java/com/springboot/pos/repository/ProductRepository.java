package com.springboot.pos.repository;

import com.springboot.pos.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByOrderByIdAsc();

    @Query("SELECT p FROM Product p WHERE p.category = :category")
    Optional<Product> findProductByCategoryJPQL(@PathVariable("category_id") Integer category);

    @Query(value = "SELECT * FROM Product p WHERE p.id = :id", nativeQuery = true)
    Optional<Product> findProductByIdNative(@PathVariable("id") Long id);

}

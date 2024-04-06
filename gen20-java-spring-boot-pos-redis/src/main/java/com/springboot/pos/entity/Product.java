package com.springboot.pos.entity;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity
@Table (name = "product")
public class Product {

    @Id
    @SequenceGenerator(
            name = "seq_product",
            sequenceName = "seq_product",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "seq_product"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String productName;
    @Column(
            name = "stock",
            nullable = true
    )
    private int stock;
    @Column(
            name = "price",
            nullable = false
    )
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Product(String productName,
                   int stock,
                   int price, Category category) {
        this.productName = productName;
        this.stock = stock;
        this.price = price;
        this.category = category;
    }
    public Product(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

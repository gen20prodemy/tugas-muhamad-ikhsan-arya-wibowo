package com.springboot.pos.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name = "category")
public class Category {
    @Id
    @Column( name = "id"
    )
    private int id;

    @Column(
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String categoryName;


    public Category(int categoryId){
        this.id = categoryId;
    }
    public Category(int categoryId, String categoryName) {
        this.id = categoryId;
        this.categoryName = categoryName;
    }

    public Category(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "category{" +
                "categoryId=" + id +
                ", categoryName ='" + categoryName + '\'' +
                '}';
    }
}

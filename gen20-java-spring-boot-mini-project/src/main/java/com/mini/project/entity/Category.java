package com.mini.project.entity;

import com.mini.project.dto.DtoCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;


    public Category(int id) {
        this.id = id;
    }
    public Category(String name){
        this.name = name;
    }

//    public DtoCategory entityToDto(){
//        DtoCategory category = new DtoCategory();
//        category.setName(name);
//        return category;
//    }
}

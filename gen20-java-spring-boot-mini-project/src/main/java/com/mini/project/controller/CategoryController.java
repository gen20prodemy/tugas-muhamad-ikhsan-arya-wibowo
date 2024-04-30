package com.mini.project.controller;

import com.mini.project.dto.DtoCategory;
import com.mini.project.entity.Category;
import com.mini.project.response.GlobalResponse;
import com.mini.project.service.ServiceCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pos/api/category")
public class CategoryController {

    private final ServiceCategory serviceCategory;

    @Autowired
    public CategoryController(ServiceCategory serviceCategory) {
        this.serviceCategory = serviceCategory;
    }
    @GetMapping
    public ResponseEntity<List<Category>> getAll(){
        List<Category> categories = serviceCategory.getAll();
        return new ResponseEntity<>(categories, HttpStatus.FOUND);
    }

    @PostMapping
    public GlobalResponse addNew(@RequestBody DtoCategory dtoCategory){
        return serviceCategory.addNewCategory(dtoCategory);
    }
}

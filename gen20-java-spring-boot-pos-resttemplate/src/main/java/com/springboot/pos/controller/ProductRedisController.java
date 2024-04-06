package com.springboot.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/redis/product")
public class ProductRedisController {

    @Autowired
    private ProductRedisRepo repo;

    @PostMapping
    public ProductRedisDTO save(@RequestBody ProductRedisDTO product){
        return repo.save(product);
    }

    @GetMapping
    public List<ProductRedisDTO> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ProductRedisDTO getById(@PathVariable int id){
        return repo.findById(id);
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable int id){
        return repo.delete(id);
    }
}

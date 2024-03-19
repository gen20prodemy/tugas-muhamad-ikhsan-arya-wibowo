package com.spring2.aritmetika.controller;

import com.spring2.aritmetika.dto.Input;
import com.spring2.aritmetika.service.BagiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/bagi")
public class BagiController {

    private final BagiService bagiService;

    @Autowired
    public BagiController(BagiService bagiService){
        this.bagiService = bagiService;
    }

    @PostMapping
    public double pembagian (@RequestBody Input input){
        return bagiService.pembagian(input);
    }
}

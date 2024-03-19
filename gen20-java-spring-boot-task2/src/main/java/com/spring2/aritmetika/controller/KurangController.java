package com.spring2.aritmetika.controller;

import com.spring2.aritmetika.dto.Input;
import com.spring2.aritmetika.service.KurangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/kurang")
public class KurangController {
    private final KurangService kurangService;

    @Autowired
    public KurangController(KurangService kurangService){
        this.kurangService = kurangService;
    }


    @PostMapping
    public int pengurangan(@RequestBody Input input){
        return kurangService.pengurangan(input);
    }
}

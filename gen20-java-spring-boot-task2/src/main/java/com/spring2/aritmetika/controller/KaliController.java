package com.spring2.aritmetika.controller;

import com.spring2.aritmetika.dto.Input;
import com.spring2.aritmetika.service.KaliService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/kali")
public class KaliController {

    private final KaliService kaliService;

    @Autowired
    public KaliController (KaliService kaliService){
        this.kaliService = kaliService;
    }

    @PostMapping
    public int pertambahan (@RequestBody Input input){
        return kaliService.perkalian(input);
    }
}

package com.spring2.aritmetika.kali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/kali")
public class KaliController {

    private final KaliService kaliService;

    @Autowired
    public KaliController (KaliService kaliService){
        this.kaliService = kaliService;
    }

    @PostMapping
    public int pertambahan (@RequestBody Kali kali){
        return kaliService.perkalian(kali);
    }
}

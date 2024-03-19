package com.spring2.aritmetika.bagi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/bagi")
public class BagiController {

    private final BagiService bagiService;

    @Autowired
    public BagiController(BagiService bagiService){
        this.bagiService = bagiService;
    }

    @PostMapping
    public double pembagian (@RequestBody Bagi bagi){
        return bagiService.pembagian(bagi);
    }
}

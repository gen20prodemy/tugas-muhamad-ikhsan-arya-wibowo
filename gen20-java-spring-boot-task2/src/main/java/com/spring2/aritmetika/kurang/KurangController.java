package com.spring2.aritmetika.kurang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/kurang")
public class KurangController {
    private final KurangService kurangService;

    @Autowired
    public KurangController(KurangService kurangService){
        this.kurangService = kurangService;
    }


    @PostMapping
    public int pengurangan(@RequestBody Kurang kurang){
        return kurangService.pengurangan(kurang);
    }
}

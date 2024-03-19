package com.spring2.aritmetika.controller;

import com.spring2.aritmetika.dto.Input;
import com.spring2.aritmetika.service.TambahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/tambah")
public class TambahController {
    private final TambahService tambahService;

    @Autowired
    public TambahController(TambahService tambahService){
        this.tambahService = tambahService;
    }


    @PostMapping
    public int penambahan(@RequestBody Input input){
        return tambahService.penambahan(input);

    }
}

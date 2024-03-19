package com.spring2.aritmetika.tambah;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/tambah")
public class TambahController {
    private final TambahService tambahService;

    @Autowired
    public TambahController(TambahService tambahService){
        this.tambahService = tambahService;
    }


    @PostMapping
    public int penambahan(@RequestBody Tambah tambah){
        return tambahService.penambahan(tambah);

    }
}

package com.spring2.aritmetika.tambah;

import org.springframework.stereotype.Service;

@Service
public class TambahService {
    public int penambahan(Tambah tambah){
        return tambah.getAngka1() + tambah.getAngka2();
    }
}

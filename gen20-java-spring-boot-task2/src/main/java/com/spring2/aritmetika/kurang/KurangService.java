package com.spring2.aritmetika.kurang;

import org.springframework.stereotype.Service;

@Service
public class KurangService {
    public int pengurangan( Kurang kurang){
        return kurang.getAngka1() - kurang.getAngka2();
    }
}

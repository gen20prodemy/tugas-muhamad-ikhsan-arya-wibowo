package com.spring2.aritmetika.kali;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class KaliService {
    public int perkalian(Kali kali){
        return kali.getAngka1() * kali.getAngka2();
    }

}

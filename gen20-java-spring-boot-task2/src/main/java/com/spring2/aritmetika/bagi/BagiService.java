package com.spring2.aritmetika.bagi;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;


@Service
public class BagiService {
    public double pembagian(Bagi bagi){
        return bagi.getAngka1()/ bagi.getAngka2();

    }

}

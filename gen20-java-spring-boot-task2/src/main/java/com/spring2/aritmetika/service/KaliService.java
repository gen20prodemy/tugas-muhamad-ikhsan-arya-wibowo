package com.spring2.aritmetika.service;

import com.spring2.aritmetika.dto.Input;
import org.springframework.stereotype.Service;


@Service
public class KaliService {
    public int perkalian(Input input){
        return input.getAngka1() * input.getAngka2();
    }

}

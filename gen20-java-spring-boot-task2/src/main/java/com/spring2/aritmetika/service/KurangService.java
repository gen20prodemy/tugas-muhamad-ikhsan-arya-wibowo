package com.spring2.aritmetika.service;

import com.spring2.aritmetika.odt.Input;
import org.springframework.stereotype.Service;

@Service
public class KurangService {
    public int pengurangan( Input input){
        return input.getAngka1() - input.getAngka2();
    }
}

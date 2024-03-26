package com.web.demo.services;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String welcome(){
        return "index";
    }


}

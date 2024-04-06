package com.web.demo.controllers;

import com.web.demo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    private HomeService homeService;

    @Autowired
    public HomeController( HomeService homeService){
        this.homeService = homeService;
    }

    @GetMapping
    public String helloWorld(){
        return homeService.welcome();
    }
}

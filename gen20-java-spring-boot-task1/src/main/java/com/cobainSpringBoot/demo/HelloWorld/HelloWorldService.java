package com.cobainSpringBoot.demo.HelloWorld;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String GetHelloWorld(){
        return "Hello World!";
    }

}

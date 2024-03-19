package com.cobainSpringBoot.demo.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "helloworld")
public class HelloWorld {
    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorld(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String getHelloWorld(){
        return helloWorldService.GetHelloWorld();
    }

}

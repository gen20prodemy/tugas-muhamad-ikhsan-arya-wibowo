package com.springboot.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMessageController {
    @Autowired
    private KafkaProducerService kafkaProducerService;

    @PostMapping("/publish/{animalName}")
    public String publishMessage(@PathVariable("animalName") final String animalName){
        kafkaProducerService.sendMessage(animalName);
        System.out.println("Successfully published the animal name = " + animalName + " to the animal topic");
        return "Successfully published the animal name = " + animalName + " to the animal topic";
    }

}

package com.springboot.pos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService  {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC_NAME = "AnimalTopic";

    public void sendMessage(String animalName){
        kafkaTemplate.send(TOPIC_NAME, animalName);
    }
}
}

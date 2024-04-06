package com.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "AnimalTopic", groupId = "Group100")
    public void listen(String animalName){
        System.out.println("Received " + animalName + " from the animalTopic");
    }
}

package com.qorri.kafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private String msg;

    public KafkaService(KafkaTemplate<String, String> kafkaTempl) {
        this.kafkaTemplate = kafkaTempl;
    }

    public void sendMessage(String message) {
        System.out.println("Prosessing Send to kafka");
        kafkaTemplate.send("example-topic", message);
        System.out.println("Succcessfully Send to kafka");
    }

    @KafkaListener(topics = "example-topic", groupId = "example-kafka-group")
    public void consume(String message) {
        System.out.println("Prosessing Get to kafka");
        this.msg = message;
        System.out.println("Succcessfully Get to kafka");
    }

    public String getMessage(){
        return msg;
    }
}

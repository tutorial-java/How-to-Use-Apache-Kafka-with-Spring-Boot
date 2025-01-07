package com.qorri.kafka.controller;

import com.qorri.kafka.dto.GenericResponse;
import com.qorri.kafka.dto.KafkaRequest;
import com.qorri.kafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tutorial-java/messaging/kafka/api/v1/")
public class KafkaController {
    @Autowired
    private KafkaService ks;

    @PostMapping("/send-to-kafka")
    public GenericResponse sendKafka(@RequestBody KafkaRequest request){
        ks.sendMessage(request.getMessage());
        return new GenericResponse("success", 200, "successfully sent to Kafka", null);
    }

    @GetMapping("/get-to-kafka")
    public GenericResponse getKafka(){
        return new GenericResponse("success", 200, "successfully get to Kafka", ks.getMessage());
    }
}

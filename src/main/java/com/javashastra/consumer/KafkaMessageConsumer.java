package com.javashastra.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageConsumer {
    @KafkaListener(topics ="quickstart-events")
    public void listen(ConsumerRecord<String,String> event){
        String payload=event.value();
        System.out.println("Consumed message ");
        System.out.println(payload);

    }
}

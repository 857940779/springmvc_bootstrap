package com.luohw.springmvc.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaOtherTopicConsumerService{
//    @KafkaListener(topics = "kafkaTest")

@KafkaListener(topics = {"kafkaTest"})
public void onMessage(ConsumerRecord<String, String> consumerRecord) {
        System.out.println("-----------消费kafka消息----------");
        System.out.println(consumerRecord.topic());
    }
}

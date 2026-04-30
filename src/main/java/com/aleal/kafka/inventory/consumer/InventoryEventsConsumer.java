package com.aleal.kafka.inventory.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class InventoryEventsConsumer {
    @KafkaListener(topics={"inventory-events"})
    public void consume(ConsumerRecord<String,String> message){
log.info("Consumed message: {}",message);
    }
}//end class

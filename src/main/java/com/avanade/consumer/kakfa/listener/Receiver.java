package com.avanade.consumer.kakfa.listener;

import com.avanade.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    @KafkaListener(topics = "${spring.kafka.consumer.topic}",
            properties = {"spring.json.value.default.type=com.avanade.model.User"})
    public void receive(@Payload User payload, @Header(KafkaHeaders.RECEIVED_TIMESTAMP) long timestamp)
    {
        if(LOGGER.isDebugEnabled()){
            LOGGER.debug("received  message {} at {} " , payload.toString(),new Date(timestamp));
        }
    }
}

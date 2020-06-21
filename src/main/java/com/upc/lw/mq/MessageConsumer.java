package com.upc.lw.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * Created by liwei on 2020/6/21
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "test", consumerGroup = "lwTest")
public class MessageConsumer implements RocketMQListener<String> {

    @Override
    public void onMessage(String message) {
        log.info("received message: " + message);
    }
}

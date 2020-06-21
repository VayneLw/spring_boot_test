package com.upc.lw.mq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by liwei on 2020/6/21
 */
@Component
@Slf4j
public class MessageProducer {
    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @Value("${rocketmq.topic1}")
    private String topic;

    public void sendMessage(String content) {
        log.info("produce message:" + content);
        try {
            rocketMQTemplate.convertAndSend(topic, content);
        } catch (Exception e) {
            log.error("send message error:", e);
        }
    }
}

package com.upc.lw.controller;

import com.upc.lw.mq.MessageProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by liwei on 2020/6/20
 */
@RestController
@Slf4j
public class InitController {
    @Autowired
    private MessageProducer messageProducer;

    //@RequestMapping("start")
    //@PostMapping("start")
    @GetMapping("start")
    public String start() {
        log.info("===InitController start===");
        return "skt t1 VS RNG";
    }

    @RequestMapping("doSend")
    public String sendMessage() {
        int nextInt = new Random().nextInt(10000);
        messageProducer.sendMessage("doSend-"+nextInt);
        return "send success";
    }
}

package com.upc.lw.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liwei on 2020/6/20
 */
@RestController
@Slf4j
public class InitController {

    //@RequestMapping("start")
    //@PostMapping("start")
    @GetMapping("start")
    public String start() {
        log.info("===InitController start===");
        return "skt t1 VS RNG";
    }
}

package com.upc.lw.config;

import com.upc.lw.service.DoTestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类是一个注解类，替代之前的spring配置文件
 * Created by liwei on 2020/6/20
 */
@Configuration
public class SpringBootApplicationConfig {

    @Bean
    public DoTestService doTestService(){
        return new DoTestService();
    }
}

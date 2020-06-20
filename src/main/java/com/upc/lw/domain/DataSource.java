package com.upc.lw.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Created by liwei on 2020/6/20
 */
@PropertySource(value = {"classpath:data.properties"})
@ConfigurationProperties(prefix = "data")
@Component
@ToString
@Data
public class DataSource {
    private String ip;
    private Map<String,String> users;
    private List<String> port;
}

package com.upc.lw.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by liwei on 2020/6/20
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
    private boolean alive;
    private Date birth;

    private Map<String,String> params;
    private List<String> lists;
    private Family family;
    private String otherInfo;
}

package com.upc.lw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwei on 2020/6/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSave(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("lw01","777");
    }

    @Test
    public void testGet(){
        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object ret = valueOperations.get("lw01");
        System.out.println("====ret==:"+ret);
    }

    @Test
    public void testStringSave(){

    }
}

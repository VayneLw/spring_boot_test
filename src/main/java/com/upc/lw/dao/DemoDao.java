package com.upc.lw.dao;

import com.upc.lw.domain.mongo.DemoEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by liwei on 2020/6/21
 */
@Component
public class DemoDao {
    @Resource
    private MongoTemplate mongoTemplate;

    public void saveDemo(DemoEntity demoEntity) {
        mongoTemplate.save(demoEntity);
    }
}

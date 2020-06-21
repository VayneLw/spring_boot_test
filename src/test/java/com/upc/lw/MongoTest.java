package com.upc.lw;

import com.upc.lw.dao.DemoDao;
import com.upc.lw.domain.mongo.DemoEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwei on 2020/6/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTest1Application.class)
public class MongoTest {
    @Autowired
    private DemoDao demoDao;

    @Test
    public void testSave(){
        DemoEntity entity = new DemoEntity();
        entity.setTitle("lbj01");
        demoDao.saveDemo(entity);
    }
}

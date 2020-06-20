package com.upc.lw;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwei on 2020/6/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void containBean(){
        boolean doTestService = applicationContext.containsBean("doTestService");
        System.out.println("contain ret:"+doTestService);
    }
}

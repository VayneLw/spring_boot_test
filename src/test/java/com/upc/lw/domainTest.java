package com.upc.lw;

import com.upc.lw.domain.Family;
import com.upc.lw.domain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liwei on 2020/6/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class domainTest {
    @Autowired
    private Person person;
    @Autowired
    private Family family;

    @Value("${init.taskName}")
    private String taskName;

    @Value("${environment}")
    private String environment;

    @Test
    public void testPerson(){
        System.out.println(person);
    }

    @Test
    public void testFamily(){
        System.out.println(family);
    }

    @Test
    public void testValue(){
        System.out.println("environment:"+environment);
        System.out.println("taskName:"+taskName);
    }
}

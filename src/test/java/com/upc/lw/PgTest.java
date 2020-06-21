package com.upc.lw;

import com.upc.lw.dao.PgUserMapper;
import com.upc.lw.domain.pg.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by liwei on 2020/6/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PgTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private PgUserMapper userMapper;

    @Test
    public void testConnect() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    @Test
    public void testQuery() throws SQLException {
        User userBtId = userMapper.getUserBtId(1);
        System.out.println(userBtId);

        List<User> users = userMapper.getUsers();
        System.out.println(users);
    }
}

package com.upc.lw.dao;

import com.upc.lw.domain.pg.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PgUserMapper {

    @Select("select * from tb_user where id=#{id}")
    User getUserBtId(int id);

    @Select("select * from tb_user ")
    List<User> getUsers();
}

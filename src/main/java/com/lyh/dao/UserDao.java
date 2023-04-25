package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :UserDao
 * @date :2023/4/250:14
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    User findById(Integer id);

    /**
     * 普通用户登陆
     * @param user
     * @return
     */
    @Select("select * from user where username=#{username} and password=#{password}")
    User login(User user);

    /**
     * 注册
     * @param user
     * @return
     */
    @Insert("insert into user (username, password) values (#{username}, #{password})")
    int register(User user);
}

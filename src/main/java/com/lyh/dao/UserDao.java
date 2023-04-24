package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :liangyuhang1
 * @className :UserDao
 * @date :2023/4/250:14
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
    User findById(Integer id);
}

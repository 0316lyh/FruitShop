package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.Manage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author :liangyuhang1
 * @className :ManageDao
 * @date :2023/4/2423:43
 */
@Mapper
public interface ManageDao extends BaseMapper<Manage> {
    /**
     * 管理员登录
     * @param manage
     * @return
     */
    @Select("select * from manage where username=#{username} and password=#{password}")
    Manage login(Manage manage);
}

package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.Manage;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :liangyuhang1
 * @className :ManageDao
 * @date :2023/4/2423:43
 */
@Mapper
public interface ManageDao extends BaseMapper<Manage> {
    //Manage selectById(Integer id);
}

package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :liangyuhang1
 * @className :OrderDao
 * @date :2023/4/2516:04
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
}

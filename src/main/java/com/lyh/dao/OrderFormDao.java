package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.OrderForm;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :OrderFormDao
 * @date :2023/4/2516:04
 */
@Mapper
public interface OrderFormDao extends BaseMapper<OrderForm> {
    /**
     * 查所有
     * @return
     */
    List<OrderForm> getAll();
    /**
     * 批量删除
     * @param ids
     * @return
     */
    int deleteByIds(@Param("ids") int[] ids);
}

package com.lyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lyh.domain.Item;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :ItemDao
 * @date :2023/4/2515:28
 */
@Mapper
public interface ItemDao extends BaseMapper<Item> {
    @Select("select * from item")
    List<Item> getAll();


    int deleteByIds(@Param("ids") int[] ids);
}
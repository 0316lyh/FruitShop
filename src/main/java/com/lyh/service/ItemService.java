package com.lyh.service;

import com.lyh.domain.Item;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :ItemService
 * @date :2023/4/2514:59
 */
public interface ItemService {
    /**
     * 查所有
     * @return
     */
    List<Item> getAll();

    /**
     * 新增水果
     * @param item
     * @return
     */
    boolean insert(Item item);

    /**
     * 按照Id删除
     * @param id
     * @return
     */
    boolean deleteById(Integer id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean deleteByIds(int[] ids);
}

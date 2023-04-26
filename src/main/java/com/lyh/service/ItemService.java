package com.lyh.service;

import com.lyh.domain.Item;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :ItemService
 * @date :2023/4/2514:59
 */
public interface ItemService {
    List<Item> getAll();
    boolean insert(Item item);
    boolean deleteById(Integer id);
    boolean deleteByIds(int[] ids);
}

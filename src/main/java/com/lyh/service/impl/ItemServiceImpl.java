package com.lyh.service.impl;

import com.lyh.dao.ItemDao;
import com.lyh.domain.Item;
import com.lyh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author :liangyuhang1
 * @className :ItemServiceImpl
 * @date :2023/4/25/15:00
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDao itemDao;

    @Override
    public List<Item> getAll() {
        List<Item> items = itemDao.selectList(null);
        return items;
    }

    @Override
    public boolean insert(Item item) {
        int insert = itemDao.insert(item);
        return insert != 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        int delete = itemDao.deleteById(id);
        return delete != 0;
    }

    @Override
    public boolean deleteByIds(int[] ids) {
        int delete = itemDao.deleteByIds(ids);
        return delete != 0;
    }
}

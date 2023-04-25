package com.lyh.service.impl;

import com.lyh.dao.ItemDao;
import com.lyh.domain.Item;
import com.lyh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }
}

package com.lyh;

import com.lyh.dao.ItemDao;
import com.lyh.domain.Item;
import com.lyh.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

@SpringBootTest
class ItemDaoTests {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ItemService itemService;

    @Test
    void testGetAll() {
/*        List<Item> items = itemDao.selectList(null);
        System.out.println(items);*/
        List<Item> all = itemDao.selectList(null);
        System.out.println(all);
    }

    @Test
    void testDeleteByIds() {
        int[] ids = new int[]{37,40};
        int delete = itemDao.deleteByIds(ids);
        System.out.println(delete);
    }



}

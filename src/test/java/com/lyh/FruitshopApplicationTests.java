package com.lyh;

import com.lyh.dao.ManageDao;
import com.lyh.dao.UserDao;
import com.lyh.domain.Manage;
import com.lyh.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FruitshopApplicationTests {
    @Autowired
    private ManageDao manageDao;
    @Autowired
    private UserDao userDao;

    @Test
    void contextLoads() {
/*        Manage manage = manageDao.selectById(1);
        System.out.println(manage);*/
        User user = userDao.findById(1);
        System.out.println(user);
    }

    @Test
    void testAdd() {
        User user = new User("222", "222");
        userDao.insert(user);
    }

}

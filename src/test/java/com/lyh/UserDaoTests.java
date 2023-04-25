package com.lyh;

import com.lyh.dao.ItemDao;
import com.lyh.dao.ManageDao;
import com.lyh.dao.UserDao;
import com.lyh.domain.Item;
import com.lyh.domain.Manage;
import com.lyh.domain.User;
import com.lyh.service.ManageService;
import com.lyh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserDaoTests {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Autowired
    private ItemDao itemDao;

    @Test
    void testLogin() {
/*        User user = new User("lyh", "020316");
        System.out.println(userService.login(user));*/
        List<Item> all = itemDao.getAll();
        System.out.println(all);
    }

    @Test
    void testRegister() {
        User user = new User("lyh2", "020316");
        System.out.println(userService.register(user));
    }



}

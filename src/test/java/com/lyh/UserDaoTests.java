package com.lyh;

import com.lyh.dao.ManageDao;
import com.lyh.dao.UserDao;
import com.lyh.domain.Manage;
import com.lyh.domain.User;
import com.lyh.service.ManageService;
import com.lyh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserDaoTests {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;

    @Test
    void testLogin() {
        User user = new User("lyh", "020316");
        System.out.println(userService.login(user));
    }

    @Test
    void testRegister() {
        User user = new User("lyh2", "020316");
        System.out.println(userService.register(user));
    }



}

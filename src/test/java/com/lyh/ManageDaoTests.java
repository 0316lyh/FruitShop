package com.lyh;

import com.lyh.dao.ManageDao;
import com.lyh.dao.UserDao;
import com.lyh.domain.Manage;
import com.lyh.domain.User;
import com.lyh.service.ManageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManageDaoTests {
    @Autowired
    private ManageDao manageDao;
    @Autowired
    private ManageService manageService;

    @Test
    void testLogin() {
        Manage lyh = new Manage("admin", "123456");
        boolean login = manageService.login(lyh);
        System.out.println(login);
    }

    @Test
    void testAdd() {

    }



}

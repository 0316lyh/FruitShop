package com.lyh.service.impl;

import com.lyh.dao.UserDao;
import com.lyh.domain.User;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :UserServiceImpl
 * @date :2023/4/25/12:45
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean login(User user) {
        return userDao.login(user) != null;
    }

    // 还没校验用户是否已存在!!!
    @Override
    public boolean register(User user) {
        return userDao.register(user) != 0;
    }
}

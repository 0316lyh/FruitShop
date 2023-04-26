package com.lyh.service;

import com.lyh.domain.User;

/**
 * @author :liangyuhang1
 * @className :UserService
 * @date :2023/4/2512:44
 */
public interface UserService {
    /**
     * 用户登陆
     * @param user
     * @return
     */
    boolean login(User user);

    /**
     * 用户注册
     * @param user
     * @return
     */
    boolean register(User user);
}

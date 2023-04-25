package com.lyh.service;

import com.lyh.domain.User;

/**
 * @author :liangyuhang1
 * @className :UserService
 * @date :2023/4/2512:44
 */
public interface UserService {
    boolean login(User user);

    boolean register(User user);
}

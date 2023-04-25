package com.lyh.service;

import com.lyh.dao.ManageDao;
import com.lyh.domain.Manage;

/**
 * @author :liangyuhang1
 * @className :ManageService
 * @date :2023/4/2512:31
 */
public interface ManageService {
    boolean login(Manage manage);
}

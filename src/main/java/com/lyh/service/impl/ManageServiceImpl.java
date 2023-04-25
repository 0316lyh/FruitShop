package com.lyh.service.impl;

import com.lyh.dao.ManageDao;
import com.lyh.domain.Manage;
import com.lyh.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :ManageServiceImpl
 * @date :2023/4/25/12:32
 */
@Service
public class ManageServiceImpl implements ManageService {
    @Autowired
    private ManageDao manageDao;

    @Override
    public boolean login(Manage manage) {
        return manageDao.login(manage) != null;
    }
}

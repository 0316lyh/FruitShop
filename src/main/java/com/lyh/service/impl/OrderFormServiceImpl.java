package com.lyh.service.impl;

import com.lyh.dao.OrderFormDao;
import com.lyh.domain.OrderForm;
import com.lyh.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :OrderFormServiceImpl
 * @date :2023/4/28/14:02
 */
@Service
public class OrderFormServiceImpl implements OrderFormService {
    @Autowired
    private OrderFormDao orderFormDao;

    @Override
    public List<OrderForm> getAll() {
        List<OrderForm> orderForms = orderFormDao.getAll();
        return orderForms;
    }

    @Override
    public boolean insert(OrderForm orderForm) {
        int insert = orderFormDao.insert(orderForm);
        return insert != 0;
    }

    @Override
    public boolean deleteById(Integer id) {
        int delete = orderFormDao.deleteById(id);
        return delete != 0;
    }

    @Override
    public boolean deleteByIds(int[] ids) {
        int delete = orderFormDao.deleteByIds(ids);
        return delete != 0;
    }
}

package com.lyh;

import com.lyh.dao.OrderFormDao;
import com.lyh.domain.OrderForm;
import com.lyh.service.OrderFormService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class OrderFormDaoTests {
    @Autowired
    private OrderFormDao orderFormDao;
    @Autowired
    private OrderFormService orderFormService;

    @Test
    void testLogin() {
        List<OrderForm> orderForms = orderFormDao.getAll();
        //List<OrderForm> orderForms = orderDao.selectList(null);
        System.out.println(orderForms);
    }

    @Test
    void testRegister() {
        OrderForm orderForm = orderFormDao.selectById(1);
        System.out.println(orderForm);
    }
}

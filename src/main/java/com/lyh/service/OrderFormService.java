package com.lyh.service;

import com.lyh.domain.OrderForm;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :OrderFormService
 * @date :2023/4/2814:02
 */
public interface OrderFormService {
    /**
     * 查所有
     * @return
     */
    List<OrderForm> getAll();

    /**
     * 新增水果
     * @param orderForm
     * @return
     */
    boolean insert(OrderForm orderForm);

    /**
     * 按照Id删除
     * @param id
     * @return
     */
    boolean deleteById(Integer id);

    /**
     * 批量删除
     * @param ids
     * @return
     */
    boolean deleteByIds(int[] ids);
}

package com.lyh.controller;

import com.lyh.domain.OrderForm;
import com.lyh.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :OrderFormController
 * @date :2023/4/28/14:01
 */
@RestController
@RequestMapping("/orderForms")
public class OrderFormController {
    @Autowired
    private OrderFormService orderFormService;

    @GetMapping
    public Result getAll() {
        System.out.println(1);
        List<OrderForm> orderForms = orderFormService.getAll();
        if (orderForms == null) {
            return new Result(Code.GET_ERR);
        } else {
            return new Result(Code.GET_OK, orderForms);
        }
    }

    @PostMapping
    public Result insert(@RequestBody OrderForm orderForm) {
        System.out.println(orderForm);
        boolean insert = orderFormService.insert(orderForm);
        return new Result(insert == true ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        boolean delete = orderFormService.deleteById(id);
        return new Result(delete != false?Code.DELETE_OK:Code.DELETE_ERR);
    }

    @DeleteMapping
    public Result deleteByIds(@RequestBody int[] ids) {
        System.out.println(ids.toString());
        boolean delete = orderFormService.deleteByIds(ids);
        return new Result(delete != false?Code.DELETE_OK:Code.DELETE_ERR);
    }
}

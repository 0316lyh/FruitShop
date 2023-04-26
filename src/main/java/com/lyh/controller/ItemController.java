package com.lyh.controller;

import com.lyh.domain.Item;
import com.lyh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :ItemController
 * @date :2023/4/26/14:41
 */
@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    public Result getAll() {
        List<Item> items = itemService.getAll();
        if (items == null) {
            return new Result(Code.GET_ERR);
        } else {
            return new Result(Code.GET_OK, items);
        }
    }
}

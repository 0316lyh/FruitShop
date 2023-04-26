package com.lyh.controller;

import com.lyh.domain.Item;
import com.lyh.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public Result insert(@RequestBody Item item) {
        System.out.println(item);
        boolean insert = itemService.insert(item);
        return new Result(insert == true ? Code.SAVE_OK : Code.SAVE_ERR);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id) {
        boolean delete = itemService.deleteById(id);
        return new Result(delete != false?Code.DELETE_OK:Code.DELETE_ERR);
    }

    @DeleteMapping
    public Result deleteByIds(@RequestBody int[] ids) {
        System.out.println(ids);
        boolean delete = itemService.deleteByIds(ids);
        return new Result(delete != false?Code.DELETE_OK:Code.DELETE_ERR);
    }
}

package com.lyh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :Item
 * @date :2023/4/25/15:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private Float price;
    private String url1;

    public Item(String name, Float price, String url1) {
        this.name = name;
        this.price = price;
        this.url1 = url1;
    }
}

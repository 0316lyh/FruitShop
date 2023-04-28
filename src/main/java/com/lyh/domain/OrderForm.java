package com.lyh.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :OrderForm
 * @date :2023/4/25/16:00
 */
@TableName("orderform")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderForm {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("user_id")
    private Integer user_id;
    @TableField("item_name")
    private String item_name;
    private Integer num;
    private float money;

    public OrderForm(Integer user_id, String item_name, Integer num, float money) {
        this.user_id = user_id;
        this.item_name = item_name;
        this.num = num;
        this.money = money;
    }
}

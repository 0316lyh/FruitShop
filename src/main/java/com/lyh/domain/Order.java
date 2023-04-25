package com.lyh.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :Order
 * @date :2023/4/25/16:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Integer id;
    private Integer user_id;
    private String item_name;
    private Integer num;
    private float money;

    public Order(Integer user_id, String item_name, Integer num, float money) {
        this.user_id = user_id;
        this.item_name = item_name;
        this.num = num;
        this.money = money;
    }
}

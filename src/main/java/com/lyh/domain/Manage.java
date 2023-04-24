package com.lyh.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :liangyuhang1
 * @className :Manage
 * @date :2023/4/24/23:43
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manage {
    private int id;
    private String username;
    private String password;

    public Manage(String username, String password) {
        this.username = username;
        this.password = password;
    }
}

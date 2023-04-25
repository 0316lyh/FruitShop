package com.lyh.controller;

import com.lyh.domain.Manage;
import com.lyh.domain.User;
import com.lyh.service.ManageService;
import com.lyh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author :liangyuhang1
 * @className :UserController
 * @date :2023/4/25/13:03
 */
@RestController
@RequestMapping("/manages")
public class ManageController {
    @Autowired
    private ManageService manageService;

/*    @PostMapping("/login")
    public Result login(@RequestBody Manage manage, HttpSession session) {
        boolean login = ManageService.login(manage);
        if (login) {
            session.setAttribute("user", manage.getUsername());
            return new Result(Code.LOGIN_OK);
        }
        return new Result(Code.LOGIN_ERR);
    }*/
}

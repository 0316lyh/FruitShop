package com.lyh.controller;

import com.lyh.domain.User;
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
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody User user, HttpSession session) {
        boolean login = userService.login(user);
        if (login) {
            session.setAttribute("user", user.getUsername());
            return new Result(Code.LOGIN_OK);
        }
        return new Result(Code.LOGIN_ERR);
    }

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        boolean register = userService.register(user);
        return new Result(register != false ? Code.REGISTER_OK : Code.REGISTER_ERR);
    }
}

package com.poldichen.markerspringboot.controller;

import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author poldi.chen
 * @className UserController
 * @description TODO
 * @date 2019/8/10 21:37
 **/
@RestController
public class UserController {

    @RequestMapping(value="/user/current_user")
    public Resp currentUser() {
        Resp resp = new Resp();
        List<User> users = new ArrayList<>();
        users.add(new User("chenxihong", "chenxihong", "poldi_chen@163.com"));
        resp.setData(users);
        return resp;
    }

}

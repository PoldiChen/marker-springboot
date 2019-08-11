package com.poldichen.markerspringboot.controller;

import com.poldichen.markerspringboot.entity.Resp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        resp.setData(10000);
        return resp;
    }

}

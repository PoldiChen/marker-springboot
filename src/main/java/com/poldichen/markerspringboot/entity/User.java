package com.poldichen.markerspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author poldi.chen
 * @className User
 * @description TODO
 * @date 2019/8/11 15:41
 **/
@AllArgsConstructor
public class User {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String display;

    @Getter
    @Setter
    private String email;
}

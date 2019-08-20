package com.poldichen.markerspringboot.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author poldi.chen
 * @className Resp
 * @description TODO
 * @date 2019/8/10 20:58
 **/
@Data
public class Resp {

    @Getter
    @Setter
    private int code;

    @Getter
    @Setter
    private Object data;

    @Getter
    @Setter
    private String message;

    public Resp() {
        this.code = 0;
        this.message = "OK";
    }
}

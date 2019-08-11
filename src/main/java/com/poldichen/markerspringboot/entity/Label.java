package com.poldichen.markerspringboot.entity;

import lombok.*;

/**
 * @author poldi.chen
 * @className Label
 * @description TODO
 * @date 2019/8/10 20:49
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Label {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;
}

package com.poldichen.markerspringboot.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author poldi.chen
 * @className Marker
 * @description TODO
 * @date 2019/8/10 20:50
 **/
@Data
public class Marker {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private int author;

    @Getter
    @Setter
    private Date updateDate;

    @Getter
    @Setter
    @JSONField(name="labels")
    private List<Label> labels;
}

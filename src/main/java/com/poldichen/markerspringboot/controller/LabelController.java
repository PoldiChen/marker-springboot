package com.poldichen.markerspringboot.controller;

import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.service.inter.ILabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author poldi.chen
 * @className LabelController
 * @description TODO
 * @date 2019/8/10 20:57
 **/
@RestController
public class LabelController {

    @Autowired
    private ILabelService labelService;

    @RequestMapping(value="/label")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Label> labels = labelService.getAll();
        resp.setData(labels);
        return resp;
    }
}

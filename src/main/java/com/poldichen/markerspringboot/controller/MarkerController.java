package com.poldichen.markerspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.poldichen.markerspringboot.entity.Marker;
import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.service.inter.IMarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author poldi.chen
 * @className MarkerController
 * @description TODO
 * @date 2019/8/10 21:44
 **/
@RestController
public class MarkerController {

    @Autowired
    private IMarkerService markerService;

    @RequestMapping(value="/marker")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Marker> markers = markerService.getAll();
        resp.setData(markers);
        return resp;
    }

    @RequestMapping(value="/marker", method = RequestMethod.POST)
    public Resp createOne(@RequestBody String markerStr) {
        Resp resp = new Resp();
        Marker marker = JSON.parseObject(markerStr, Marker.class);

        JSONObject jsonObject = JSON.parseObject(markerStr);


        System.out.println("marker labels:" + marker.getLabels());

        int markerId = markerService.createOne(marker);
        resp.setData(markerId);
        return resp;
    }
}

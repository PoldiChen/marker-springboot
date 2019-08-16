package com.poldichen.markerspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.poldichen.markerspringboot.entity.Marker;
import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.service.inter.IMarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
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

    @RequestMapping(value = "/marker")
    public Resp getAll() {
        Resp resp = new Resp();
        List<Marker> markers = markerService.getAll();
        resp.setData(markers);
        return resp;
    }

    @RequestMapping(value = "/marker", method = RequestMethod.POST)
    public Resp createOne(@RequestBody String markerStr) {
        Resp resp = new Resp();
        Marker marker = JSON.parseObject(markerStr, new TypeReference<Marker>(){});
        marker.setUpdateDate(new Date());
        int markerId = markerService.createOne(marker);
        resp.setData(markerId);
        return resp;
    }

    @RequestMapping(value = "/marker/{id}", method = RequestMethod.PUT)
    public Resp updateOne(@PathVariable int id, @RequestBody String markerStr) {
        System.out.println(id);
        System.out.println(markerStr);
        Marker marker = JSON.parseObject(markerStr, new TypeReference<Marker>(){});
        marker.setId(id);
        marker.setUpdateDate(new Date());
        markerService.updateOne(marker);
        Resp resp = new Resp();
        return resp;
    }
}

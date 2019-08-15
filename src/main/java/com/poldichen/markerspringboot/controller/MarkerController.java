package com.poldichen.markerspringboot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.poldichen.markerspringboot.entity.Marker;
import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.service.inter.IMarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author poldi.chen
 * @className MarkerController
 * @description TODO
 * @date 2019/8/10 21:44
 **/
@RestController
public class MarkerController {

    public static void main(String[] args) {
        String str = "{\n" +
                "\t\"title\": \"qqq\",\n" +
                "\t\"content\": \"qqq\",\n" +
                "\t\"author\": 222,\n" +
                "\t\"labels\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": 1,\n" +
                "\t\t\t\"name\": \"aa\"\n" +
                "\t\t}, {\n" +
                "\t\t\t\"id\": 2,\n" +
                "\t\t\t\"name\": \"bb\"\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";
        Marker marker = JSON.parseObject(str, Marker.class);
        System.out.println(marker.getTitle());
        System.out.println(marker.getId());
        System.out.println(marker.getLabels());
    }

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
        Marker marker = JSON.parseObject(markerStr, new TypeReference<Marker>(){});
        int markerId = markerService.createOne(marker);
        resp.setData(markerId);
        return resp;
    }
}

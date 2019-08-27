package com.poldichen.markerspringboot.controller;

import com.poldichen.markerspringboot.entity.Resp;
import com.poldichen.markerspringboot.service.inter.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author poldi.chen
 * @className StatisticController
 * @description TODO
 * @date 2019/8/27 14:43
 **/
@RestController
public class StatisticController {

    @Autowired
    private StatisticService statisticService;

    @RequestMapping(value="/statistic")
    public Resp getStatistic() {
        Resp resp = new Resp();
        Map<String, Integer> result = statisticService.getStatistic();
        resp.setData(result);
        return resp;
    }

}

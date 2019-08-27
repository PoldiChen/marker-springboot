package com.poldichen.markerspringboot.service.impl;

import com.poldichen.markerspringboot.dao.ILabelDao;
import com.poldichen.markerspringboot.dao.IMarkerDao;
import com.poldichen.markerspringboot.dao.IUserDao;
import com.poldichen.markerspringboot.service.inter.StatisticService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author poldi.chen
 * @className StatisticServiceImpl
 * @description TODO
 * @date 2019/8/27 14:44
 **/
@Service
public class StatisticServiceImpl implements StatisticService {

    @Autowired
    private IUserDao userDao;

    @Autowired
    private IMarkerDao markerDao;

    @Autowired
    private ILabelDao labelDao;

    @Override
    public Map<String, Integer> getStatistic() {
        Map<String, Integer> result = new HashMap<>();
        result.put("user", userDao.countUsers());
        result.put("marker", markerDao.countMarkers());
        result.put("label", labelDao.countLabels());
        return result;
    }
}

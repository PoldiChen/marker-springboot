package com.poldichen.markerspringboot.service.impl;

import com.poldichen.markerspringboot.dao.IMarkerDao;
import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.entity.Marker;
import com.poldichen.markerspringboot.service.inter.IMarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author poldi.chen
 * @className MarkerServiceImpl
 * @description TODO
 * @date 2019/8/10 21:42
 **/
@Component
public class MarkerServiceImpl implements IMarkerService {

    @Autowired
    private IMarkerDao markerDao;

    @Override
    public List<Marker> getAll() {
        return markerDao.getAll();
    }

    @Override
    public int createOne(Marker marker) {
        System.out.println(marker.getId());
        // 创建一条新的marker记录
        markerDao.createOne(marker);
        // 添加marker和label的关联
        markerDao.createMarkerLabel(marker.getId(), getLabelIds(marker));
        return marker.getId();
    }

    @Override
    public int updateOne(Marker marker) {
        // 更新marker
        markerDao.updateOne(marker);
        // 删除marker和label的关联
        markerDao.deleteMarkerLabel(marker.getId());
        // 新增marker和label的关联
        markerDao.createMarkerLabel(marker.getId(), getLabelIds(marker));
        return 1;
    }

    private List<Integer> getLabelIds(Marker marker) {
        List<Integer> labelIds = new ArrayList<>();
        for (Label label : marker.getLabels()) {
            labelIds.add(label.getId());
        }
        return labelIds;
    }
}

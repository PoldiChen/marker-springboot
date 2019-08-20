package com.poldichen.markerspringboot;

import com.poldichen.markerspringboot.MarkerSpringbootApplication;
import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.entity.Marker;
import com.poldichen.markerspringboot.service.inter.IMarkerService;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author poldi.chen
 * @className MarkerTest
 * @description TODO
 * @date 2019/8/10 21:02
 **/
//@Transactional //支持数据回滚，避免测试数据污染环境
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkerSpringbootApplication.class)
public class MarkerTest {

    @Autowired
    public IMarkerService markerService;

    @Test
    public void testGetAll() {
        List<Marker> markers = markerService.getAll();
        for (Marker marker : markers) {
            System.out.println(marker.getTitle());
        }
    }

    @Test
    public void testUpdateOne() {
        Marker marker = new Marker();
        marker.setId(7);
        marker.setTitle("cccc");
        marker.setContent("ddddd");
        marker.setAuthor(222);
        marker.setUpdateDate(new Date());
        List<Label> labels = new ArrayList<>();
        labels.add(new Label(3, "a"));
        labels.add(new Label(4, "d"));
        marker.setLabels(labels);
        markerService.updateOne(marker);
    }

}

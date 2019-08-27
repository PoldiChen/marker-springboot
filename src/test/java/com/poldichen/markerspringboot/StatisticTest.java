package com.poldichen.markerspringboot;

import com.poldichen.markerspringboot.service.inter.StatisticService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author poldi.chen
 * @className StatisticTest
 * @description TODO
 * @date 2019/8/27 14:48
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkerSpringbootApplication.class)
public class StatisticTest {

    @Autowired
    private StatisticService statisticService;

    @Test
    public void testGetStatistic() {
        System.out.println(statisticService.getStatistic());
    }
}

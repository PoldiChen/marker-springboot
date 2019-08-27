package com.poldichen.markerspringboot;

import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.service.inter.ILabelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author poldi.chen
 * @className LabelTest
 * @description TODO
 * @date 2019/8/27 12:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkerSpringbootApplication.class)
public class LabelTest {

    @Autowired
    private ILabelService labelService;

    @Test
    public void testCreateOne() {
        Label label = new Label();
        label.setName("test");
        int result = labelService.createOne(label);
        System.out.println(result);
    }
}

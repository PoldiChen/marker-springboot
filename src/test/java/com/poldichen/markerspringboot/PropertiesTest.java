package com.poldichen.markerspringboot;

import io.jsonwebtoken.Jwt;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author poldi.chen
 * @className PropertiesTest
 * @description TODO
 * @date 2019/8/20 12:59
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkerSpringbootApplication.class)
public class PropertiesTest {

    @Value("${jwt.secret}")
    private String jwtSecret;

    @Test
    public void readTest() {
        System.out.println(jwtSecret);
    }
}

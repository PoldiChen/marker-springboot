package com.poldichen.markerspringboot;

import com.poldichen.markerspringboot.entity.User;
import com.poldichen.markerspringboot.service.inter.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author poldi.chen
 * @className UserTest
 * @description TODO
 * @date 2019/8/20 9:53
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MarkerSpringbootApplication.class)
public class UserTest {

    @Autowired
    private IUserService userService;

    @Test
    public void testCreateOne() {
        User user = new User();
        user.setUserName("aa");
        user.setDisplay("bb");
        user.setPassword("ccc");
        user.setEmail("dd");
        int userId = userService.createOne(user);
        System.out.println("user id: " + userId);
    }

    @Test
    public void testGetByName() {
        User user = userService.getByName("poldi");
        System.out.println(user.getEmail());
    }

}

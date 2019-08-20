package com.poldichen.markerspringboot.service.impl;

import com.poldichen.markerspringboot.dao.IUserDao;
import com.poldichen.markerspringboot.entity.User;
import com.poldichen.markerspringboot.entity.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author poldi.chen
 * @className UserDetailsServiceImpl
 * @description TODO
 * @date 2019/8/20 10:30
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private IUserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername");
        System.out.println(username);
        User user = userDao.getByName(username);
        System.out.println(user);
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
//        List<String> list = new ArrayList<>();
//        list.add("a");
        UserDTO userDto = new UserDTO();
        userDto.setUserName(username);
        userDto.setPassword(user.getPassword());
        return userDto;
//        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }

}

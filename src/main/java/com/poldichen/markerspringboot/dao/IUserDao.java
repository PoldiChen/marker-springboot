package com.poldichen.markerspringboot.dao;

import com.poldichen.markerspringboot.entity.User;
import org.apache.ibatis.annotations.Param;

public interface IUserDao {

    public int createOne(@Param("user") User user);

}

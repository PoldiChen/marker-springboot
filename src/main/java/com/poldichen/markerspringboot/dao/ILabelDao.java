package com.poldichen.markerspringboot.dao;

import com.poldichen.markerspringboot.entity.Label;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ILabelDao {

    List<Label> getAll();

    int createOne(@Param("label") Label label);

    int countLabels();
}

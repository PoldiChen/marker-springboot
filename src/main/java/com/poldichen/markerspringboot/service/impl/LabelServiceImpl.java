package com.poldichen.markerspringboot.service.impl;

import com.poldichen.markerspringboot.dao.ILabelDao;
import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.service.inter.ILabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author poldi.chen
 * @className LabelServiceImpl
 * @description TODO
 * @date 2019/8/10 21:03
 **/
@Component
public class LabelServiceImpl implements ILabelService {

    @Autowired
    private ILabelDao labelDao;

    @Override
    public List<Label> getAll() {
        return labelDao.getAll();
    }
}

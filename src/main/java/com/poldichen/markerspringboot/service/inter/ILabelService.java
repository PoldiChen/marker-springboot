package com.poldichen.markerspringboot.service.inter;

import com.poldichen.markerspringboot.entity.Label;

import java.util.List;

public interface ILabelService {

    public List<Label> getAll();

    public int createOne(Label label);
}

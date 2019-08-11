package com.poldichen.markerspringboot.service.inter;

import com.poldichen.markerspringboot.entity.Marker;

import java.util.List;

public interface IMarkerService {

    public List<Marker> getAll();

    public int createOne(Marker marker);
}

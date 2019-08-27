package com.poldichen.markerspringboot.service.inter;

import com.poldichen.markerspringboot.entity.Marker;

import java.util.List;

public interface IMarkerService {

    List<Marker> getAll();

    int createOne(Marker marker);

    int updateOne(Marker marker);

    int deleteOne(int markerId);
}

package com.poldichen.markerspringboot.dao;

import com.poldichen.markerspringboot.entity.Label;
import com.poldichen.markerspringboot.entity.Marker;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IMarkerDao {

    public List<Marker> getAll();

    public int createOne(@Param("marker") Marker marker);

    public void createMarkerLabel(@Param("markerParams") List<Map<String, Integer>> params);
}

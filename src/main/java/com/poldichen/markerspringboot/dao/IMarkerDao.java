package com.poldichen.markerspringboot.dao;

import com.poldichen.markerspringboot.entity.Marker;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface IMarkerDao {

    public List<Marker> getAll();

    public int createOne(@Param("marker") Marker marker);

    public void createMarkerLabel(@Param("marker_id") int markerId, @Param("label_ids") List<Integer> labelIds);

    public int updateOne(@Param("marker") Marker marker);

    public void deleteMarkerLabel(@Param("marker_id") int markerId);

    public int deleteOne(@Param("id") int id);

    int countMarkers();
}

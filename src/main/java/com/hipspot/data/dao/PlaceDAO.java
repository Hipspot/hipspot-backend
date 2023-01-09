package com.hipspot.data.dao;

import com.hipspot.data.entity.PlaceEntity;

public interface PlaceDAO {

    PlaceEntity savePlace(PlaceEntity placeEntity);

    PlaceEntity getPlace(Long placeId);
}

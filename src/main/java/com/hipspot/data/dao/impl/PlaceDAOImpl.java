package com.hipspot.data.dao.impl;

import com.hipspot.data.dao.PlaceDAO;
import com.hipspot.data.entity.PlaceEntity;
import com.hipspot.data.repository.PlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceDAOImpl implements PlaceDAO {
    PlaceRepository placeRepository;

    public PlaceDAOImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public PlaceEntity savePlace(PlaceEntity placeEntity) {
        placeRepository.save(placeEntity);
        return placeEntity;
    }

    @Override
    public PlaceEntity getPlace(Long placeId) {
        PlaceEntity placeEntity = placeRepository.getReferenceById(placeId);
        return placeEntity;
    }
}

package com.hipspot.data.repository;

import com.hipspot.data.dto.PlaceDTO;
import com.hipspot.data.entity.PlaceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<PlaceEntity, Long> {
}
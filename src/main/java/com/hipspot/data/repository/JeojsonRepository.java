package com.hipspot.data.repository;

import com.hipspot.data.dto.JeojsonDTO;
import com.hipspot.data.entity.JeojsonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JeojsonRepository extends JpaRepository<JeojsonEntity, Long> {
}

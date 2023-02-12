package com.hipspot.service;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.domain.cafes.GeojsonRepository;
import com.hipspot.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class GeojsonsService {

    private final GeojsonRepository geojsonRepository;

    public GeojsonResponseDto findById(Long id) {
        Geojsons entity = geojsonRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 데이터가 없습니다. id = " + id));

        return new GeojsonResponseDto(entity);
    }

    public List<GeojsonResponseDto> findAll() {
        return GeojsonResponseDto.from(geojsonRepository.findAll());
    }

}

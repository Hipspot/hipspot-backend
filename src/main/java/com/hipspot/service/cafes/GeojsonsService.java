package com.hipspot.service.cafes;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.domain.cafes.GeojsonsRepository;
import com.hipspot.web.dto.GeojsonResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class GeojsonsService {

    private final GeojsonsRepository geojsonsRepository;

    public GeojsonResponseDto findById(Long id) {
        Geojsons entity = geojsonsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 데이터가 없습니다. id = " + id));
        return new GeojsonResponseDto(entity);
    }

}

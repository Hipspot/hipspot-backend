package com.hipspot.service.cafes;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.domain.cafes.GeojsonsRepository;
import com.hipspot.web.dto.GeoProperResponseDto;
import com.hipspot.web.dto.GeojsonsResponseDto;
import com.hipspot.web.dto.GeojsonsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class GeojsonsService {

    private final GeojsonsRepository geojsonsRepository;

    @Transactional
    public Long save(GeojsonsSaveRequestDto requestDto) {
        return geojsonsRepository.save(requestDto.toEntity()).getId();
    }

    public GeojsonsResponseDto findById(Long id) {
        Geojsons entity = geojsonsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 좌표가 없습니다. id = " + id));
        return new GeojsonsResponseDto(entity);
    }

//    public GeoProperResponseDto join() {
//        join
//    }
}

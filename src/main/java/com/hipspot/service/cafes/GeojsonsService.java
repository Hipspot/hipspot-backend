package com.hipspot.service.cafes;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.domain.cafes.GeojsonsRepository;
import com.hipspot.web.dto.GeojsonResponseDto;
import com.hipspot.web.dto.Geometry;
import com.hipspot.web.dto.Properties;
import com.hipspot.web.dto.Type;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GeojsonsService {

    private final GeojsonsRepository geojsonsRepository;

    public List<GeojsonResponseDto> findById(Long id) {
        Geojsons entity = geojsonsRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 데이터가 없습니다. id = " + id));

        List<Long> coordinates = new ArrayList<>();
        coordinates.add(entity.getLatitude());
        coordinates.add(entity.getLongitude());

        Properties properties = new Properties(entity);
        Geometry geometry = new Geometry("Point", coordinates);
        Type type = new Type("Feature");
//
        List<GeojsonResponseDto> geojsonResponseDtoList = new ArrayList<>();
        GeojsonResponseDto geojsonResponseDto = new GeojsonResponseDto(properties, geometry, type);
        geojsonResponseDtoList.add(geojsonResponseDto);

        return geojsonResponseDtoList;
    }

}

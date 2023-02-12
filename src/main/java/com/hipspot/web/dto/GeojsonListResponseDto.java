package com.hipspot.web.dto;

import com.hipspot.domain.cafes.GeojsonRepository;
import com.hipspot.service.GeojsonsService;

import java.util.ArrayList;
import java.util.List;

public class GeojsonListResponseDto {
    private List geojsonListResponseDto;
    private GeojsonRepository geojsonRepository;
    private GeojsonsService geojsonsService;

    public GeojsonListResponseDto() {
        List<GeojsonResponseDto> geojsonResponseDtoList = new ArrayList<>();

        Long index = geojsonRepository.count();
        for (Long i = Long.valueOf(0); i<index; i++){
            GeojsonResponseDto geojsonResponseDto = geojsonsService.findById(i);
            geojsonResponseDtoList.add(geojsonResponseDto);
        }
        this.geojsonListResponseDto = geojsonResponseDtoList;
    }
}

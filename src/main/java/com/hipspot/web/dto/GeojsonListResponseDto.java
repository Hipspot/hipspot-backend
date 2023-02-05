package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.domain.cafes.GeojsonsRepository;
import com.hipspot.service.cafes.GeojsonsService;

import java.util.ArrayList;
import java.util.List;

public class GeojsonListResponseDto {
    private List geojsonListResponseDto;
    private GeojsonsRepository geojsonsRepository;
    private GeojsonsService geojsonsService;

    public GeojsonListResponseDto() {
        List<GeojsonResponseDto> geojsonResponseDtoList = new ArrayList<>();

        Long index = geojsonsRepository.count();
        System.out.println("index = " + index);
        for (Long i = Long.valueOf(0); i<index; i++){
            GeojsonResponseDto geojsonResponseDto = geojsonsService.findById(i);
            geojsonResponseDtoList.add(geojsonResponseDto);
        }
        this.geojsonListResponseDto = geojsonResponseDtoList;
    }
}

package com.hipspot.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class GeojsonResponseDto {
    private Properties properties;
    private List<Integer> coordinates;

    @Builder
    public GeojsonResponseDto(GeojsonResponseDto entity) {
        this.properties = entity.getProperties();
        this.coordinates = entity.getCoordinates();
    }
}

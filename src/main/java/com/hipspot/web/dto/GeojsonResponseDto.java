package com.hipspot.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class GeojsonResponseDto {
    private List<String> properties;
    private List<Integer> coordinates;

    @Builder
    public GeojsonResponseDto(GeojsonResponseDto entity) {
        this.properties = entity.getProperties();
        this.coordinates = entity.getCoordinates();
    }
}

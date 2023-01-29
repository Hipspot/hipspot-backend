package com.hipspot.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class GeojsonResponseDto {
    private Properties properties;
    private Geometry geometry;
    private Type type;

    public GeojsonResponseDto(Properties properties, Geometry geometry, Type type) {
        this.properties = properties;
        this.geometry = geometry;
        this.type = type;
    }
}

package com.hipspot.web.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class GeometryDto {

    private String type;
    private List<Long> coordinates;

    public GeometryDto(String type, List<Long> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
}

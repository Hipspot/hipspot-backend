package com.hipspot.web.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class GeometryDto {

    private String type;
    private List<Double> coordinates;

    public GeometryDto(String type, List<Double> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
}

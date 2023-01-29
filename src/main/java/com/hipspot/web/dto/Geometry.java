package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class Geometry {

    private String type;
    private List<Long> coordinates;

    public Geometry(String type, List<Long> coordinates) {
        this.type = type;
        this.coordinates = coordinates;
    }
}

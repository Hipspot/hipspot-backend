package com.hipspot.domain.cafes;

import lombok.Builder;
import lombok.Getter;


@Getter
public class Coordinate {
    private Integer latitude;

    private Integer longitude;

    @Builder
    public Coordinate(Geojsons entity) {
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
    }
}

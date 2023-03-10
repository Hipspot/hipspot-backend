package com.hipspot.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hipspot.domain.cafes.Geojsons;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class GeojsonResponseDto {
    @JsonProperty(value = "properties")
    private PropertiesDto propertiesDto;
    @JsonProperty(value = "geometry")
    private GeometryDto geometryDto;
    private Type type;


    public GeojsonResponseDto(Geojsons entity) {
        List<Double> coordinates = new ArrayList<>();
        coordinates.add(entity.getLatitude());
        coordinates.add(entity.getLongitude());
        Type point = Type.Point;

        this.geometryDto = new GeometryDto(point.name(), coordinates);
        this.propertiesDto = new PropertiesDto(entity);
        this.type = Type.Feature;
    }

    public static List<GeojsonResponseDto> from(List<Geojsons> allGeojsons){
        List<GeojsonResponseDto> allGeojsonResponseDto = new ArrayList<>();
        for(Geojsons geojsons : allGeojsons) {
            allGeojsonResponseDto.add(new GeojsonResponseDto(geojsons));
        }
        return allGeojsonResponseDto;
    }
}

package com.hipspot.data.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

import java.util.ArrayList;


@NoArgsConstructor
public class JeojsonDTO {
    private ArrayList<String> properties;
    private ArrayList<String> geometry;

    private int id;
    private int filterId;
    private String instaId;
    private String placeName;

    private Point coordinates;

    public JeojsonDTO(ArrayList<String> properties, ArrayList<String> geometry, int id, int filterId, String instaId, String placeName, Point coordinates) {
        this.properties = properties;
        this.geometry = geometry;
        this.id = id;
        this.filterId = filterId;
        this.instaId = instaId;
        this.placeName = placeName;
        this.coordinates = coordinates;
    }


}

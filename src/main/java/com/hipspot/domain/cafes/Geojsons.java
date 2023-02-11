package com.hipspot.domain.cafes;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Geojsons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeName;

    private String filterList;

    private String instaId;

    private Double latitude;

    private Double longitude;


    @Builder
    public Geojsons(Long id, String placeName, String filterList, String instaId, Double latitude, Double longitude) {
        this.id = id;
        this.placeName = placeName;
        this.filterList = filterList;
        this.instaId = instaId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

package com.hipspot.domain.cafes;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class Geojsons {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placeName;

    private Integer filterId;

    private String instaId;

    private Integer latitude;

    private Integer longitude;

    @Builder
    public Geojsons(Long id, String placeName, Integer filterId, String instaId, Integer latitude, Integer longitude) {
        this.id = id;
        this.placeName = placeName;
        this.filterId = filterId;
        this.instaId = instaId;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

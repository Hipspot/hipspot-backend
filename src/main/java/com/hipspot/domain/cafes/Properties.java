package com.hipspot.domain.cafes;

import com.hipspot.domain.cafes.Geojsons;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
public class Properties {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String placeName;

    private Integer filterId;

    private String instaId;



    @Builder
    public Properties(Geojsons entity) {
        this.id = entity.getId();
        this.placeName = entity.getPlaceName();
        this.filterId = entity.getFilterId();
        this.instaId = entity.getInstaId();
    }
}

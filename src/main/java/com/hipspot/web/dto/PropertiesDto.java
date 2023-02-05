package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import lombok.Builder;
import lombok.Getter;


@Getter
public class PropertiesDto {

    private Long id;

    private String placeName;

    private Integer filterId;

    private String instaId;



    @Builder
    public PropertiesDto(Geojsons entity) {
        this.id = entity.getId();
        this.placeName = entity.getPlaceName();
        this.filterId = entity.getFilterId();
        this.instaId = entity.getInstaId();
    }
}

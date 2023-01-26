package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public class GeojsonsResponseDto {

    private Long id;

    private String placeName;

    private Integer filterId;

    private String instaId;

    private Integer latitude;

    private Integer longitude;

    @Builder
    public GeojsonsResponseDto(Geojsons entity) {
        this.id = entity.getId();
        this.placeName = entity.getPlaceName();
        this.filterId = entity.getFilterId();
        this.instaId = entity.getInstaId();
        this.latitude = entity.getLatitude();
        this.longitude = entity.getLongitude();
    }


}

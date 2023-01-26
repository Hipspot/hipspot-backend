package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GeojsonsSaveRequestDto {

    private String placeName;

    private Integer filterId;

    private String instaId;

    private Integer latitude;

    private Integer longitude;

    @Builder
    public GeojsonsSaveRequestDto(String placeName, Integer filterId, String instaId, Integer latitude, Integer longitude) {
        this.placeName = placeName;
        this.filterId = filterId;
        this.instaId = instaId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Geojsons toEntity() {
        return Geojsons.builder()
                .placeName(placeName)
                .filterId(filterId)
                .instaId(instaId)
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}

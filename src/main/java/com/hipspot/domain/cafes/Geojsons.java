package com.hipspot.domain.cafes;

import com.hipspot.web.dto.Properties;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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

    private List<Properties> propertiesList;

    /**
     * properties, coordinates dto 객체로 만들고 리스트로 받아오고 싶지만 해결 중 ..
     */


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

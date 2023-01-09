package com.hipspot.data.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "place")
public class PlaceEntity {

    @Id
    Long placeId;


    String placeName;
    String address;
    String businessDay;
    String contactNum;
    String instaId;
    String imageList; // 여러개 어떻게 받을 것 인가 ?
    String naverMapUrl;
    String kakaomapUrl;

    public void setPlaceId(Long placeId) {
        this.placeId = placeId;
    }

    @javax.persistence.Id
    public Long getPlaceId() {
        return placeId;
    }
}

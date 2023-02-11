package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Geojsons;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class PropertiesDto {

    private Long id;

    private String placeName;

    private List<Integer> filterList;

    private String instaId;



    @Builder
    public PropertiesDto(Geojsons entity) {
        this.id = entity.getId();
        this.placeName = entity.getPlaceName();
        this.filterList = StringToNumber(entity);
        this.instaId = entity.getInstaId();


    }

    public List<Integer> StringToNumber(Geojsons entity) {
        String filterListString = entity.getFilterList();

        int end = filterListString.length();
        String NumberList = filterListString.substring(1, end-1);
        List<Integer> filterListInteger = new ArrayList<>();

        for(String s:NumberList.split(", ")) {
            filterListInteger.add(Integer.parseInt(s));
        }
        return filterListInteger;
    }
}

package com.hipspot.web;

import com.hipspot.domain.cafes.Geojsons;
import com.hipspot.service.cafes.GeojsonsService;
import com.hipspot.web.dto.GeoProperResponseDto;
import com.hipspot.web.dto.GeojsonsResponseDto;
import com.hipspot.web.dto.GeojsonsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class GeojsonsApiController {

    private final GeojsonsService geojsonsService;

    @GetMapping("/api/geojson/{id}")
    public GeojsonsResponseDto findById(@PathVariable Long id) {
        ArrayList<Integer> coordinate = new ArrayList<>();
        HashMap<String, String> properties = new HashMap<>();
        ArrayList<Object> lst = new ArrayList<>();

        Integer Latitude = geojsonsService.findById(id).getLatitude();
        Integer Longitude = geojsonsService.findById(id).getLongitude();

        coordinate.add(Latitude);
        coordinate.add(Longitude);

        String InstaId = geojsonsService.findById(id).getInstaId();
        Long Id = geojsonsService.findById(id).getId();
        Integer FilterId = geojsonsService.findById(id).getFilterId();
        String PlaceName = geojsonsService.findById(id).getPlaceName();

        properties.put("Id", String.valueOf(Id));
        properties.put("InstaId", InstaId);
        properties.put("FilterId", String.valueOf(FilterId));
        properties.put("PlaceName", PlaceName);

        lst.add(coordinate);
        lst.add(properties);

        return geojsonsService.findById(id);
    }
}

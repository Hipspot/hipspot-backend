package com.hipspot.web;

import com.hipspot.service.cafes.GeojsonsService;
import com.hipspot.domain.cafes.Coordinate;
import com.hipspot.domain.cafes.Properties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class GeojsonsApiController {

    private final GeojsonsService geojsonsService;

    @GetMapping("/api/geojson/info/{id}")
    public Properties InfofindById(@PathVariable Long id) {

        return geojsonsService.InfofindById(id);
    }

    @GetMapping("/api/geojson/coordi/{id}")
    public Coordinate CoordifindById(@PathVariable Long id) {

        return geojsonsService.CoordifindById(id);
    }

}

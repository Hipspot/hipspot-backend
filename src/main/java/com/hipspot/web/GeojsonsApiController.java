package com.hipspot.web;

import com.hipspot.generic.Result;
import com.hipspot.service.cafes.GeojsonsService;
import com.hipspot.web.dto.GeojsonListResponseDto;
import com.hipspot.web.dto.GeojsonResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class GeojsonsApiController {

    private final GeojsonsService geojsonsService;

    @GetMapping("/api/geojson/{id}")
    public GeojsonResponseDto findById(@PathVariable Long id) {

        return geojsonsService.findById(id);
    }

    @GetMapping("/api/geojsons")
    public GeojsonListResponseDto findAll() {
        return geojsonsService.findAll();
    }

}

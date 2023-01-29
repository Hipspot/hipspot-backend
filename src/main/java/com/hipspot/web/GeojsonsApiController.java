package com.hipspot.web;

import com.hipspot.service.cafes.GeojsonsService;
import com.hipspot.web.dto.GeojsonResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
public class GeojsonsApiController {

    private final GeojsonsService geojsonsService;

    @GetMapping("/api/geojson/{id}")
    public GeojsonResponseDto findById(@PathVariable Long id) {

        /**
         * properties, coordinates 에 각 정보들을 담아 객체를 만들고 그 객체들을 GeojsonResponseDto
         * 에 담고싶지만 실패
         */



        return geojsonsService.findById(id);
    }


}

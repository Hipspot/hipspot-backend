package com.hipspot.controller;

import com.hipspot.data.dto.PlaceDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/geo")
public class geoJsonController {

    @GetMapping("/geoJson")
    public String getgeoJson() {
        return "metod : get, value : geoJson";
    }

    @PostMapping("/geoJson")
    public String PostgeoJson() {
        return "method : post, value : geoJson";
    }

    @GetMapping("/geoJsonD")
    public String getgeoJsonDto(PlaceDTO placeDTO) {
        return placeDTO.toString();
    }

    @PostMapping("geoJsonD")
    public String postgeoJsonDto(PlaceDTO placeDTO) {
        return placeDTO.toString();
    }
}

package com.hipspot.controller;

import com.hipspot.data.dto.PlaceDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("place")
public class PlaceController {

    @GetMapping("/{id}")
    public String newPlace(PlaceDTO placeDTO, @PathVariable("id") Integer id) {


        return "metod : get, value : place";
    }

    @PostMapping("place")
    public String PostPlace(PlaceDTO placeDTO) {

        return "method : post, value : place";
    }
}

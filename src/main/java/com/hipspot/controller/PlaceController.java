package com.hipspot.controller;

import com.hipspot.data.dto.PlaceDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("place")
public class PlaceController {

    @GetMapping("/place")
    public String newPlace() {
        return "metod : get, value : place";
    }

    @PostMapping("place")
    public String PostPlace(PlaceDTO placeDTO) {

        return "method : post, value : place";
    }
}

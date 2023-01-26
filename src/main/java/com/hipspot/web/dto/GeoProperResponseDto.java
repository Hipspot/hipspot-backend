package com.hipspot.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeoProperResponseDto {
    private GeojsonsResponseDto properties;
    private GeojsonsResponseDto coordinates;
}

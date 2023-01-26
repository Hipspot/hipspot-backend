package com.hipspot.web;


import com.hipspot.service.cafes.CafesService;
import com.hipspot.web.dto.CafesResponseDto;
import com.hipspot.web.dto.CafesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CafesApiController {

    private final CafesService cafesService;

    @PostMapping("/api/cafes")
    public Long save(@RequestBody CafesSaveRequestDto requestDto) {
        return cafesService.save(requestDto);
    }

    @GetMapping("/api/cafe/{id}")
    public CafesResponseDto findById (@PathVariable Long id) {
        return cafesService.findById(id);
    }

    @GetMapping("/api/test")
    public String tset() {
        return "testapi";
    }

}

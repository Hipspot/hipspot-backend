package com.hipspot.service;

import com.hipspot.domain.cafes.Cafes;
import com.hipspot.domain.cafes.CafesRepository;
import com.hipspot.web.dto.CafesResponseDto;
import com.hipspot.web.dto.CafesSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CafesService {

    private final CafesRepository cafesRepository;

    @Transactional
    public Long save(CafesSaveRequestDto requestDto) {
        return cafesRepository.save(requestDto.toEntity()).getId();
    }

    public CafesResponseDto findById(Long id) {
        Cafes entity = cafesRepository.findById(id)
                .orElseThrow(() -> new
                        IllegalArgumentException("해당 카페가 없습니다. id=" + id));

        return new CafesResponseDto(entity);
    }
}

package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Cafes;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CafesSaveRequestDto {

    private String name;

    private String time;

    private String phone;

    private Integer cafePhoto;

    private Integer menuPhoto;

    private String cafeTag;

    private String insta;

    private Integer amePrice;

    private String address;

    private String review;

    @Builder
    public CafesSaveRequestDto(String name, String time, String phone, Integer cafePhoto, Integer menuPhoto, String cafeTag, String insta, int amePrice, String address, String review) {
        this.name = name;
        this.time = time;
        this.phone = phone;
        this.cafePhoto = cafePhoto;
        this.menuPhoto = menuPhoto;
        this.cafeTag = cafeTag;
        this.insta = insta;
        this.amePrice = amePrice;
        this.address = address;
        this.review = review;
    }

    public Cafes toEntity() {
        return Cafes.builder()
                .name(name)
                .businessTime(time)
                .phone(phone)
                .cafePhoto(cafePhoto)
                .menuPhoto(menuPhoto)
                .cafeTag(cafeTag)
                .insta(insta)
                .amePrice(amePrice)
                .address(address)
                .review(review)
                .build();
    }
}

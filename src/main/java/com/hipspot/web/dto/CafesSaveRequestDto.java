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

    private String address1;

    private String address2;

    private String review;

    @Builder
    public CafesSaveRequestDto(String name, String time, String phone, Integer cafePhoto, Integer menuPhoto, String cafeTag, String insta, int amePrice, String address1, String address2, String review) {
        this.name = name;
        this.time = time;
        this.phone = phone;
        this.cafePhoto = cafePhoto;
        this.menuPhoto = menuPhoto;
        this.cafeTag = cafeTag;
        this.insta = insta;
        this.amePrice = amePrice;
        this.address1 = address1;
        this.address2 = address2;
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
                .address1(address1)
                .address2(address2)
                .review(review)
                .build();
    }
}

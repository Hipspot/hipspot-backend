package com.hipspot.web.dto;

import com.hipspot.domain.cafes.Cafes;
import lombok.Builder;
import lombok.Getter;

@Getter
public class CafesResponseDto {

    private Long id;

    private String name;

    private String businessTime;

    private String businessDay;

    private String phone;

    private Integer cafePhoto;

    private Integer menuPhoto;

    private String cafeTag;

    private String insta;

    private Integer amePrice;

    private String address1;

    private String address2;

    private String review;
    private String star;

    @Builder
    public CafesResponseDto(Cafes entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.businessDay = entity.getBusinessDay();
        this.businessTime = entity.getBusinessTime();
        this.phone = entity.getPhone();
        this.cafePhoto = entity.getCafePhoto();
        this.menuPhoto = entity.getMenuPhoto();
        this.cafeTag = entity.getCafeTag();
        this.insta = entity.getInsta();
        this.amePrice = entity.getAmePrice();
        this.address1 = entity.getAddress1();
        this.address2 = entity.getAddress2();
        this.review = entity.getReview();
        this.star = entity.getStar();
    }
}

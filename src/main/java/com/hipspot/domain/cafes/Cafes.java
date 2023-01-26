package com.hipspot.domain.cafes;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Cafes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String BusinessTime;

    private String BusinessDay;

    private String star;

    private String phone;

    private Integer cafePhoto;

    private Integer menuPhoto;

    private String cafeTag;

    private String insta;

    private Integer amePrice;

    private String address;


    private String review;


    @Builder
    public Cafes(Long id, String name, String businessTime, String businessDay, String phone, Integer cafePhoto, Integer menuPhoto, String cafeTag, String insta, Integer amePrice, String address, String review, String star) {
        this.id = id;
        this.name = name;
        this.BusinessTime = businessTime;
        this.BusinessDay = businessDay;
        this.phone = phone;
        this.cafePhoto = cafePhoto;
        this.menuPhoto = menuPhoto;
        this.cafeTag = cafeTag;
        this.insta = insta;
        this.amePrice = amePrice;
        this.address = address;
        this.review = review;
        this.star = star;
    }
}

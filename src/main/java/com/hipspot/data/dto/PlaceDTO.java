package com.hipspot.data.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PlaceDTO {
    private String placeName;
    private String address;
    private String businessDay;
    private String contactNum;
    private String instaId;
    private String imageList; // 여러개 어떻게 받을 것인가 ?

    public PlaceDTO(List<String> imageList1) {
        this.imageList1 = imageList1;
    }

    public List<String> getImageList1() {
        return imageList1;
    }

    public void setImageList1(List<String> imageList1) {
        this.imageList1 = imageList1;
    }

    private List<String> imageList1;
    private String naverMapUrl;
    private String kakaomapUrl;

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinessDay() {
        return businessDay;
    }

    public void setBusinessDay(String businessDay) {
        this.businessDay = businessDay;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public String getInstaId() {
        return instaId;
    }

    public void setInstaId(String instaId) {
        this.instaId = instaId;
    }

    public String getImageList() {
        return imageList;
    }

    public void setImageList(String imageList) {
        this.imageList = imageList;
    }

    public String getNaverMapUrl() {
        return naverMapUrl;
    }

    public void setNaverMapUrl(String naverMapUrl) {
        this.naverMapUrl = naverMapUrl;
    }

    public String getKakaomapUrl() {
        return kakaomapUrl;
    }

    public void setKakaomapUrl(String kakaomapUrl) {
        this.kakaomapUrl = kakaomapUrl;
    }

    public PlaceDTO(String placeName, String address, String businessDay, String contactNum, String instaId, int id, String imageList, String naverMapUrl, String kakaomapUrl) {
        this.placeName = placeName;
        this.address = address;
        this.businessDay = businessDay;
        this.contactNum = contactNum;
        this.instaId = instaId;
        this.imageList = imageList;
        this.naverMapUrl = naverMapUrl;
        this.kakaomapUrl = kakaomapUrl;
    }

    @Override
    public String toString() {
        return "PlaceDTO{" +
                "placeName='" + placeName + '\'' +
                ", address='" + address + '\'' +
                ", businessDay='" + businessDay + '\'' +
                ", contactNum='" + contactNum + '\'' +
                ", instaId='" + instaId + '\'' +
                ", imageList='" + imageList + '\'' +
                ", naverMapUrl='" + naverMapUrl + '\'' +
                ", kakaomapUrl='" + kakaomapUrl + '\'' +
                '}';
    }
}

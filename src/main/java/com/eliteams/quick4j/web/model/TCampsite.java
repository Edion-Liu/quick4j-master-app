package com.eliteams.quick4j.web.model;

import java.io.Serializable;

public class TCampsite implements Serializable{
    private Integer id;

    private Integer userId;

    private String name;

    private String address;

    private String city;

    private String style;

    private Integer type;

    private Integer isParkPayment;

    private Integer isCanPark;

    private Integer isCanTrailer;

    private Integer isHasWater;

    private Integer isHasElectric;

    private Integer isHasToilet;

    private Integer isCanCooking;

    private Integer isHasMarkets;

    private Integer isCanFishing;

    private Integer isCanSwimming;

    private Integer isCanTent;

    private Double longitude;

    private String kCode;

    private Double latitude;

    private Integer isDefaultName;

    private Integer isCheck;

    private Integer score;

    private Integer isValid;

    private String createdAt;

    private String updatedAt;

    private String romantictime;

    private String romanticlong;

    private String withdevice;

    private String romanticstarttime;

    private String romanticendtime;

    private String ticketprice;

    private String specialty;

    private String consume;

    private String impression;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style == null ? null : style.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getIsParkPayment() {
        return isParkPayment;
    }

    public void setIsParkPayment(Integer isParkPayment) {
        this.isParkPayment = isParkPayment;
    }

    public Integer getIsCanPark() {
        return isCanPark;
    }

    public void setIsCanPark(Integer isCanPark) {
        this.isCanPark = isCanPark;
    }

    public Integer getIsCanTrailer() {
        return isCanTrailer;
    }

    public void setIsCanTrailer(Integer isCanTrailer) {
        this.isCanTrailer = isCanTrailer;
    }

    public Integer getIsHasWater() {
        return isHasWater;
    }

    public void setIsHasWater(Integer isHasWater) {
        this.isHasWater = isHasWater;
    }

    public Integer getIsHasElectric() {
        return isHasElectric;
    }

    public void setIsHasElectric(Integer isHasElectric) {
        this.isHasElectric = isHasElectric;
    }

    public Integer getIsHasToilet() {
        return isHasToilet;
    }

    public void setIsHasToilet(Integer isHasToilet) {
        this.isHasToilet = isHasToilet;
    }

    public Integer getIsCanCooking() {
        return isCanCooking;
    }

    public void setIsCanCooking(Integer isCanCooking) {
        this.isCanCooking = isCanCooking;
    }

    public Integer getIsHasMarkets() {
        return isHasMarkets;
    }

    public void setIsHasMarkets(Integer isHasMarkets) {
        this.isHasMarkets = isHasMarkets;
    }

    public Integer getIsCanFishing() {
        return isCanFishing;
    }

    public void setIsCanFishing(Integer isCanFishing) {
        this.isCanFishing = isCanFishing;
    }

    public Integer getIsCanSwimming() {
        return isCanSwimming;
    }

    public void setIsCanSwimming(Integer isCanSwimming) {
        this.isCanSwimming = isCanSwimming;
    }

    public Integer getIsCanTent() {
        return isCanTent;
    }

    public void setIsCanTent(Integer isCanTent) {
        this.isCanTent = isCanTent;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getkCode() {
        return kCode;
    }

    public void setkCode(String kCode) {
        this.kCode = kCode == null ? null : kCode.trim();
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getIsDefaultName() {
        return isDefaultName;
    }

    public void setIsDefaultName(Integer isDefaultName) {
        this.isDefaultName = isDefaultName;
    }

    public Integer getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Integer isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRomantictime() {
        return romantictime;
    }

    public void setRomantictime(String romantictime) {
        this.romantictime = romantictime == null ? null : romantictime.trim();
    }

    public String getRomanticlong() {
        return romanticlong;
    }

    public void setRomanticlong(String romanticlong) {
        this.romanticlong = romanticlong == null ? null : romanticlong.trim();
    }

    public String getWithdevice() {
        return withdevice;
    }

    public void setWithdevice(String withdevice) {
        this.withdevice = withdevice == null ? null : withdevice.trim();
    }

    public String getRomanticstarttime() {
        return romanticstarttime;
    }

    public void setRomanticstarttime(String romanticstarttime) {
        this.romanticstarttime = romanticstarttime == null ? null : romanticstarttime.trim();
    }

    public String getRomanticendtime() {
        return romanticendtime;
    }

    public void setRomanticendtime(String romanticendtime) {
        this.romanticendtime = romanticendtime == null ? null : romanticendtime.trim();
    }

    public String getTicketprice() {
        return ticketprice;
    }

    public void setTicketprice(String ticketprice) {
        this.ticketprice = ticketprice == null ? null : ticketprice.trim();
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty == null ? null : specialty.trim();
    }

    public String getConsume() {
        return consume;
    }

    public void setConsume(String consume) {
        this.consume = consume == null ? null : consume.trim();
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression == null ? null : impression.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
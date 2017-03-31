package com.eliteams.quick4j.web.model;

import java.io.Serializable;

public class TUser implements Serializable{
    private Integer id;

    private String email;

    private String phone;

    private String name;

    private Integer nickName;

    private String password;

    private String address;

    private String city;

    private String description;

    private String deviceToken;

    private Integer pushSet;

    private String icon;

    private String lastLoginDate;

    private String accessToken;

    private String uniqueToken;

    private Integer deviceType;

    private String osVersion;

    private String phoneNumber;

    private Integer credentialNum;

    private Integer credentialType;

    private Integer score;

    private String snsToken;

    private String snsId;

    private Integer snsType;

    private String snsAccount;

    private Double longitude;

    private Double latitude;

    private Integer isShare;

    private Integer isVisible;

    private Integer wowoCount;

    private Integer attractionCount;

    private Integer stayCount;

    private Integer enterainmentCount;

    private Integer foodCount;

    private String randStr;

    private Integer points;

    private String title;

    private Integer level;

    private Integer isPhoneAuth;

    private Integer licenseAuthStatus;

    private String license;

    private String shopName;

    private String shopAddress;

    private String shopPhone;

    private Double shopLat;

    private Double shopLng;

    private Integer role;

    private String kCode;

    private Integer isValid;

    private Integer isBlack;

    private String createdAt;

    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getNickName() {
        return nickName;
    }

    public void setNickName(Integer nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken == null ? null : deviceToken.trim();
    }

    public Integer getPushSet() {
        return pushSet;
    }

    public void setPushSet(Integer pushSet) {
        this.pushSet = pushSet;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getUniqueToken() {
        return uniqueToken;
    }

    public void setUniqueToken(String uniqueToken) {
        this.uniqueToken = uniqueToken == null ? null : uniqueToken.trim();
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public Integer getCredentialNum() {
        return credentialNum;
    }

    public void setCredentialNum(Integer credentialNum) {
        this.credentialNum = credentialNum;
    }

    public Integer getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(Integer credentialType) {
        this.credentialType = credentialType;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getSnsToken() {
        return snsToken;
    }

    public void setSnsToken(String snsToken) {
        this.snsToken = snsToken == null ? null : snsToken.trim();
    }

    public String getSnsId() {
        return snsId;
    }

    public void setSnsId(String snsId) {
        this.snsId = snsId == null ? null : snsId.trim();
    }

    public Integer getSnsType() {
        return snsType;
    }

    public void setSnsType(Integer snsType) {
        this.snsType = snsType;
    }

    public String getSnsAccount() {
        return snsAccount;
    }

    public void setSnsAccount(String snsAccount) {
        this.snsAccount = snsAccount == null ? null : snsAccount.trim();
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getIsShare() {
        return isShare;
    }

    public void setIsShare(Integer isShare) {
        this.isShare = isShare;
    }

    public Integer getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Integer isVisible) {
        this.isVisible = isVisible;
    }

    public Integer getWowoCount() {
        return wowoCount;
    }

    public void setWowoCount(Integer wowoCount) {
        this.wowoCount = wowoCount;
    }

    public Integer getAttractionCount() {
        return attractionCount;
    }

    public void setAttractionCount(Integer attractionCount) {
        this.attractionCount = attractionCount;
    }

    public Integer getStayCount() {
        return stayCount;
    }

    public void setStayCount(Integer stayCount) {
        this.stayCount = stayCount;
    }

    public Integer getEnterainmentCount() {
        return enterainmentCount;
    }

    public void setEnterainmentCount(Integer enterainmentCount) {
        this.enterainmentCount = enterainmentCount;
    }

    public Integer getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(Integer foodCount) {
        this.foodCount = foodCount;
    }

    public String getRandStr() {
        return randStr;
    }

    public void setRandStr(String randStr) {
        this.randStr = randStr == null ? null : randStr.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getIsPhoneAuth() {
        return isPhoneAuth;
    }

    public void setIsPhoneAuth(Integer isPhoneAuth) {
        this.isPhoneAuth = isPhoneAuth;
    }

    public Integer getLicenseAuthStatus() {
        return licenseAuthStatus;
    }

    public void setLicenseAuthStatus(Integer licenseAuthStatus) {
        this.licenseAuthStatus = licenseAuthStatus;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public Double getShopLat() {
        return shopLat;
    }

    public void setShopLat(Double shopLat) {
        this.shopLat = shopLat;
    }

    public Double getShopLng() {
        return shopLng;
    }

    public void setShopLng(Double shopLng) {
        this.shopLng = shopLng;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getkCode() {
        return kCode;
    }

    public void setkCode(String kCode) {
        this.kCode = kCode == null ? null : kCode.trim();
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Integer getIsBlack() {
        return isBlack;
    }

    public void setIsBlack(Integer isBlack) {
        this.isBlack = isBlack;
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
}
package com.eliteams.quick4j.web.model;

import java.io.Serializable;

/**
 * 实现序列化接口  将对象进行序列化
 */
public class NewActivity implements Serializable{
    private Integer id;

    private Integer type;

    private String starttime;

    private String endtime;

    private String activityaddress;

    private Integer smReimbursetype;

    private Integer smRmdate;

    private String suPhone;

    private Integer suEndtime;

    private Integer suNametype;

    private Integer suPhonetype;

    private Integer suWechattype;

    private Integer suQqtype;

    private String activitytheme;

    private String publishtime;

    private String themedetail;

    private Integer persontype;

    private Integer personcount;

    private Integer personmax;

    private String chargename;

    private Integer charge;

    private String videourl;

    private Integer scancount;

    private Integer sharecount;

    private String imageurl;

    private String signature;

    private String name;

    private String identityAuthentication;

    private Integer userid;

    private Integer joinstatus;

    private Double longitude;

    private Double latitude;

    private Integer province;

    private Integer goodactivity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getActivityaddress() {
        return activityaddress;
    }

    public void setActivityaddress(String activityaddress) {
        this.activityaddress = activityaddress == null ? null : activityaddress.trim();
    }

    public Integer getSmReimbursetype() {
        return smReimbursetype;
    }

    public void setSmReimbursetype(Integer smReimbursetype) {
        this.smReimbursetype = smReimbursetype;
    }

    public Integer getSmRmdate() {
        return smRmdate;
    }

    public void setSmRmdate(Integer smRmdate) {
        this.smRmdate = smRmdate;
    }

    public String getSuPhone() {
        return suPhone;
    }

    public void setSuPhone(String suPhone) {
        this.suPhone = suPhone == null ? null : suPhone.trim();
    }

    public Integer getSuEndtime() {
        return suEndtime;
    }

    public void setSuEndtime(Integer suEndtime) {
        this.suEndtime = suEndtime;
    }

    public Integer getSuNametype() {
        return suNametype;
    }

    public void setSuNametype(Integer suNametype) {
        this.suNametype = suNametype;
    }

    public Integer getSuPhonetype() {
        return suPhonetype;
    }

    public void setSuPhonetype(Integer suPhonetype) {
        this.suPhonetype = suPhonetype;
    }

    public Integer getSuWechattype() {
        return suWechattype;
    }

    public void setSuWechattype(Integer suWechattype) {
        this.suWechattype = suWechattype;
    }

    public Integer getSuQqtype() {
        return suQqtype;
    }

    public void setSuQqtype(Integer suQqtype) {
        this.suQqtype = suQqtype;
    }

    public String getActivitytheme() {
        return activitytheme;
    }

    public void setActivitytheme(String activitytheme) {
        this.activitytheme = activitytheme == null ? null : activitytheme.trim();
    }

    public String getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(String publishtime) {
        this.publishtime = publishtime;
    }

    public String getThemedetail() {
        return themedetail;
    }

    public void setThemedetail(String themedetail) {
        this.themedetail = themedetail == null ? null : themedetail.trim();
    }

    public Integer getPersontype() {
        return persontype;
    }

    public void setPersontype(Integer persontype) {
        this.persontype = persontype;
    }

    public Integer getPersoncount() {
        return personcount;
    }

    public void setPersoncount(Integer personcount) {
        this.personcount = personcount;
    }

    public Integer getPersonmax() {
        return personmax;
    }

    public void setPersonmax(Integer personmax) {
        this.personmax = personmax;
    }

    public String getChargename() {
        return chargename;
    }

    public void setChargename(String chargename) {
        this.chargename = chargename == null ? null : chargename.trim();
    }

    public Integer getCharge() {
        return charge;
    }

    public void setCharge(Integer charge) {
        this.charge = charge;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }

    public Integer getScancount() {
        return scancount;
    }

    public void setScancount(Integer scancount) {
        this.scancount = scancount;
    }

    public Integer getSharecount() {
        return sharecount;
    }

    public void setSharecount(Integer sharecount) {
        this.sharecount = sharecount;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentityAuthentication() {
        return identityAuthentication;
    }

    public void setIdentityAuthentication(String identityAuthentication) {
        this.identityAuthentication = identityAuthentication == null ? null : identityAuthentication.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getJoinstatus() {
        return joinstatus;
    }

    public void setJoinstatus(Integer joinstatus) {
        this.joinstatus = joinstatus;
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

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getGoodactivity() {
        return goodactivity;
    }

    public void setGoodactivity(Integer goodactivity) {
        this.goodactivity = goodactivity;
    }
}
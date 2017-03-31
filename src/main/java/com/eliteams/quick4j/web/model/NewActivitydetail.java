package com.eliteams.quick4j.web.model;

public class NewActivitydetail {
    private Integer id;

    private Integer activityid;

    private String imageurl;

    private String imagedetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public String getImagedetail() {
        return imagedetail;
    }

    public void setImagedetail(String imagedetail) {
        this.imagedetail = imagedetail == null ? null : imagedetail.trim();
    }
}
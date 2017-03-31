package com.eliteams.quick4j.web.model;

public class NewYuebanimage {
    private Integer id;

    private String imageurl;

    private Integer yuebanid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl == null ? null : imageurl.trim();
    }

    public Integer getYuebanid() {
        return yuebanid;
    }

    public void setYuebanid(Integer yuebanid) {
        this.yuebanid = yuebanid;
    }
}
package com.eliteams.quick4j.web.model;

public class NewSoftware {
    private Integer id;

    private Integer rangeupdateminid;

    private Integer rangeupdatemaxid;

    private String version;

    private String appurl;

    private String publishdate;

    private String newdescribe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRangeupdateminid() {
        return rangeupdateminid;
    }

    public void setRangeupdateminid(Integer rangeupdateminid) {
        this.rangeupdateminid = rangeupdateminid;
    }

    public Integer getRangeupdatemaxid() {
        return rangeupdatemaxid;
    }

    public void setRangeupdatemaxid(Integer rangeupdatemaxid) {
        this.rangeupdatemaxid = rangeupdatemaxid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getAppurl() {
        return appurl;
    }

    public void setAppurl(String appurl) {
        this.appurl = appurl == null ? null : appurl.trim();
    }

    public String getPublishdate() {
        return publishdate;
    }

    public void setPublishdate(String publishdate) {
        this.publishdate = publishdate;
    }

    public String getNewdescribe() {
        return newdescribe;
    }

    public void setNewdescribe(String newdescribe) {
        this.newdescribe = newdescribe == null ? null : newdescribe.trim();
    }
}
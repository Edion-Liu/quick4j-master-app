package com.eliteams.quick4j.web.model;

public class NewYuebancomment {
    private Integer id;

    private Integer yuebanid;

    private String yuebancontent;

    private String yuebantime;

    private Integer yuebancommentid;

    private Integer yuebancommentsex;

    private Integer yuebandistanc;

    private String yuebancommentname;

    private String yuebancommenticon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYuebanid() {
        return yuebanid;
    }

    public void setYuebanid(Integer yuebanid) {
        this.yuebanid = yuebanid;
    }

    public String getYuebancontent() {
        return yuebancontent;
    }

    public void setYuebancontent(String yuebancontent) {
        this.yuebancontent = yuebancontent == null ? null : yuebancontent.trim();
    }

    public String getYuebantime() {
        return yuebantime;
    }

    public void setYuebantime(String yuebantime) {
        this.yuebantime = yuebantime;
    }

    public Integer getYuebancommentid() {
        return yuebancommentid;
    }

    public void setYuebancommentid(Integer yuebancommentid) {
        this.yuebancommentid = yuebancommentid;
    }

    public Integer getYuebancommentsex() {
        return yuebancommentsex;
    }

    public void setYuebancommentsex(Integer yuebancommentsex) {
        this.yuebancommentsex = yuebancommentsex;
    }

    public Integer getYuebandistanc() {
        return yuebandistanc;
    }

    public void setYuebandistanc(Integer yuebandistanc) {
        this.yuebandistanc = yuebandistanc;
    }

    public String getYuebancommentname() {
        return yuebancommentname;
    }

    public void setYuebancommentname(String yuebancommentname) {
        this.yuebancommentname = yuebancommentname == null ? null : yuebancommentname.trim();
    }

    public String getYuebancommenticon() {
        return yuebancommenticon;
    }

    public void setYuebancommenticon(String yuebancommenticon) {
        this.yuebancommenticon = yuebancommenticon == null ? null : yuebancommenticon.trim();
    }
}
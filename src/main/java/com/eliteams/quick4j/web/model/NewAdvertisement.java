package com.eliteams.quick4j.web.model;

public class NewAdvertisement {
    private Integer id;

    private String adupdate;

    private String adtitle;

    private String addescribe;

    private String adimage;

    private Integer adtype;

    private String adlink;

    private Integer adclickcount;

    private Integer adbusiness;

    private String adphone;

    private String advaliddate;

    private Integer advalidcount;

    private Integer advalidtype;

    private Integer adstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdupdate() {
        return adupdate;
    }

    public void setAdupdate(String adupdate) {
        this.adupdate = adupdate;
    }

    public String getAdtitle() {
        return adtitle;
    }

    public void setAdtitle(String adtitle) {
        this.adtitle = adtitle == null ? null : adtitle.trim();
    }

    public String getAddescribe() {
        return addescribe;
    }

    public void setAddescribe(String addescribe) {
        this.addescribe = addescribe == null ? null : addescribe.trim();
    }

    public String getAdimage() {
        return adimage;
    }

    public void setAdimage(String adimage) {
        this.adimage = adimage == null ? null : adimage.trim();
    }

    public Integer getAdtype() {
        return adtype;
    }

    public void setAdtype(Integer adtype) {
        this.adtype = adtype;
    }

    public String getAdlink() {
        return adlink;
    }

    public void setAdlink(String adlink) {
        this.adlink = adlink == null ? null : adlink.trim();
    }

    public Integer getAdclickcount() {
        return adclickcount;
    }

    public void setAdclickcount(Integer adclickcount) {
        this.adclickcount = adclickcount;
    }

    public Integer getAdbusiness() {
        return adbusiness;
    }

    public void setAdbusiness(Integer adbusiness) {
        this.adbusiness = adbusiness;
    }

    public String getAdphone() {
        return adphone;
    }

    public void setAdphone(String adphone) {
        this.adphone = adphone == null ? null : adphone.trim();
    }

    public String getAdvaliddate() {
        return advaliddate;
    }

    public void setAdvaliddate(String advaliddate) {
        this.advaliddate = advaliddate;
    }

    public Integer getAdvalidcount() {
        return advalidcount;
    }

    public void setAdvalidcount(Integer advalidcount) {
        this.advalidcount = advalidcount;
    }

    public Integer getAdvalidtype() {
        return advalidtype;
    }

    public void setAdvalidtype(Integer advalidtype) {
        this.advalidtype = advalidtype;
    }

    public Integer getAdstatus() {
        return adstatus;
    }

    public void setAdstatus(Integer adstatus) {
        this.adstatus = adstatus;
    }
}
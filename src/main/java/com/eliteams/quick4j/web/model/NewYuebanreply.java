package com.eliteams.quick4j.web.model;

public class NewYuebanreply {
    private Integer id;

    private Integer yuebancommentreplyid;

    private String yuebanreplydate;

    private String yuebanreplycontent;

    private String yuebanreplyto;

    private String yuebanreplyusername;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYuebancommentreplyid() {
        return yuebancommentreplyid;
    }

    public void setYuebancommentreplyid(Integer yuebancommentreplyid) {
        this.yuebancommentreplyid = yuebancommentreplyid;
    }

    public String getYuebanreplydate() {
        return yuebanreplydate;
    }

    public void setYuebanreplydate(String yuebanreplydate) {
        this.yuebanreplydate = yuebanreplydate;
    }

    public String getYuebanreplycontent() {
        return yuebanreplycontent;
    }

    public void setYuebanreplycontent(String yuebanreplycontent) {
        this.yuebanreplycontent = yuebanreplycontent == null ? null : yuebanreplycontent.trim();
    }

    public String getYuebanreplyto() {
        return yuebanreplyto;
    }

    public void setYuebanreplyto(String yuebanreplyto) {
        this.yuebanreplyto = yuebanreplyto == null ? null : yuebanreplyto.trim();
    }

    public String getYuebanreplyusername() {
        return yuebanreplyusername;
    }

    public void setYuebanreplyusername(String yuebanreplyusername) {
        this.yuebanreplyusername = yuebanreplyusername == null ? null : yuebanreplyusername.trim();
    }
}
package com.eliteams.quick4j.web.model;

public class NewAttitude {
    private Integer id;

    private Integer tCampsiteId;

    private Integer type;

    private Integer userId;

    private Integer typeCampsite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer gettCampsiteId() {
        return tCampsiteId;
    }

    public void settCampsiteId(Integer tCampsiteId) {
        this.tCampsiteId = tCampsiteId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTypeCampsite() {
        return typeCampsite;
    }

    public void setTypeCampsite(Integer typeCampsite) {
        this.typeCampsite = typeCampsite;
    }
}
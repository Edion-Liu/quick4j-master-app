package com.eliteams.quick4j.web.model;

public class NewInvitenumber {
    private Integer id;

    private String invitenumber;

    private String uniqueToken;

    private Integer shareCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvitenumber() {
        return invitenumber;
    }

    public void setInvitenumber(String invitenumber) {
        this.invitenumber = invitenumber == null ? null : invitenumber.trim();
    }

    public String getUniqueToken() {
        return uniqueToken;
    }

    public void setUniqueToken(String uniqueToken) {
        this.uniqueToken = uniqueToken == null ? null : uniqueToken.trim();
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }
}
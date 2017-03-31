package com.eliteams.quick4j.web.model;

public class NewWallet {
    private Integer id;

    private Integer userid;

    private Integer cash;

    private Integer inoutmoney;

    private String time;

    private Integer money;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCash() {
        return cash;
    }

    public void setCash(Integer cash) {
        this.cash = cash;
    }

    public Integer getInoutmoney() {
        return inoutmoney;
    }

    public void setInoutmoney(Integer inoutmoney) {
        this.inoutmoney = inoutmoney;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}
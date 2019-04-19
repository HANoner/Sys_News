package com.qianfeng.entity;

import java.util.Date;

public class pinglun {
    private Integer id;

    private String pingluninfo;

    private String pingluner;

    private Date pingluntime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPingluninfo() {
        return pingluninfo;
    }

    public void setPingluninfo(String pingluninfo) {
        this.pingluninfo = pingluninfo == null ? null : pingluninfo.trim();
    }

    public String getPingluner() {
        return pingluner;
    }

    public void setPingluner(String pingluner) {
        this.pingluner = pingluner == null ? null : pingluner.trim();
    }

    public Date getPingluntime() {
        return pingluntime;
    }

    public void setPingluntime(Date pingluntime) {
        this.pingluntime = pingluntime;
    }
}
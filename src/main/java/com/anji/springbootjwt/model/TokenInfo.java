package com.anji.springbootjwt.model;

import java.io.Serializable;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/12 17:26
 */
@Entity
@Table(name="api_token_infos")
public class TokenInfo implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="ati_id")
    private Long id;

    @Column(name = "ati_app_id")
    private String appId;

    @Column(name="ati_token")
    private byte[] token;

    @Column(name="ati_build_time")
    private String buildTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public String getBuildTime() {
        return buildTime;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }
}

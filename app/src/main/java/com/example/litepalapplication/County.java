package com.example.litepalapplication;


import org.litepal.crud.LitePalSupport;

/**
 * 代表县的数据库表
 */

public class County extends LitePalSupport
{
    private int id;
    private String countyName;  //县的名字
    private String weatherId;   //天气id
    private int cityId;    //当前县所属城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
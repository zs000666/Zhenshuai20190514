package com.bawei.zhenshuai20190514.bean;

/*
 *@Auther:甄帅
 *@Date: 时间
 *@Description:功能
 * */public class Bean {
     private String address;
     private String logo;
     private String name;

    public Bean(String address, String logo, String name) {
        this.address = address;
        this.logo = logo;
        this.name = name;
    }

    public Bean() {
    }

    @Override
    public String toString() {
        return "Bean{" +
                "address='" + address + '\'' +
                ", logo='" + logo + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.jk.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Shop implements Serializable{

    private Integer id;
    private String name;
    private Integer price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date onlinedate;
    private String photo;
    private Integer sumren;

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", onlinedate=" + onlinedate +
                ", photo='" + photo + '\'' +
                ", sumren=" + sumren +
                '}';
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getOnlinedate() {
        return onlinedate;
    }

    public void setOnlinedate(Date onlinedate) {
        this.onlinedate = onlinedate;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Integer getSumren() {
        return sumren;
    }

    public void setSumren(Integer sumren) {
        this.sumren = sumren;
    }
}

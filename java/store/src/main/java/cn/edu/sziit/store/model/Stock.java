package cn.edu.sziit.store.model;

import java.io.Serializable;

public class Stock implements Serializable {

    private String name;    //商品名
    private String price;   //价格
    private String cnt;     //库存
    private String category;   //类型
    private String img;     //图片

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCnt() {
        return cnt;
    }

    public void setCnt(String cnt) {
        this.cnt = cnt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", cnt='" + cnt + '\'' +
                ", category='" + category + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
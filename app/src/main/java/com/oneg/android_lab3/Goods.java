package com.oneg.android_lab3;

public class Goods {
    private String Name;
    private String ShopName;
    private int imgGoods;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public int getImgGoods() {
        return imgGoods;
    }

    public void setImgGoods(int imgGoods) {
        this.imgGoods = imgGoods;
    }

    public Goods(String name, String shopName, int imgGoods) {
        Name = name;
        ShopName = shopName;
        this.imgGoods = imgGoods;
    }


}

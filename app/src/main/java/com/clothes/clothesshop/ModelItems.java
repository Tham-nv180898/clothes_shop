package com.clothes.clothesshop;

public class ModelItems {

    private int imagePath;
    private String title;
    private String price;

    public ModelItems(int imagePath, String title, String price) {
        this.imagePath = imagePath;
        this.title = title;
        this.price = price;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

package com.food.foodapplication;

public class ModelItems {

    private int imagePath;
    private String title;

    public ModelItems(int imagePath, String title) {
        this.imagePath = imagePath;
        this.title = title;
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
}

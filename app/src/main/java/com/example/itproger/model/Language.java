package com.example.itproger.model;

public class Language {
    private int id,category;
    String jobTitle,bgColor,img,lessonStart,lessonLevel;

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLessonStart() {
        return lessonStart;
    }

    public void setLessonStart(String lessonStart) {
        this.lessonStart = lessonStart;
    }

    public String getLessonLevel() {
        return lessonLevel;
    }

    public void setLessonLevel(String lessonLevel) {
        this.lessonLevel = lessonLevel;
    }

    public Language(int id,String jobTitle, String bgColor, String img, String lessonStart, String lessonLevel, int category) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.bgColor = bgColor;
        this.img = img;
        this.lessonStart = lessonStart;
        this.lessonLevel = lessonLevel;
        this.category = category;
    }
}

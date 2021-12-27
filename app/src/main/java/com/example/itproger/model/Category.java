package com.example.itproger.model;

public class Category {
    private String categoryTest;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryTest() {
        return categoryTest;
    }

    public void setCategoryTest(String categoryTest) {
        this.categoryTest = categoryTest;
    }

    public Category(int id,String categoryTest) {
        this.categoryTest = categoryTest;
        this.id = id;
    }
}

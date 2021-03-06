package com.example.restapi.model;

public class FamousPeople {
    private String name;
    private String birthday;
    private String about;
    private String urlIcon;

    public FamousPeople(){}

    public FamousPeople(String name, String birthday, String about){
        this.name = name;
        this.birthday = birthday;
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }
}

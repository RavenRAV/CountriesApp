package com.example.countriesapp;

public class CountryModel {
    private String name;
    private int flag;
    private String capital;

    public CountryModel(String name, int flag, String capital) {
        this.name = name;
        this.flag = flag;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}

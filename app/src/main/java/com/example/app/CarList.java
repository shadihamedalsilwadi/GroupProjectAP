package com.example.app;

public class CarList {

    private  String model;
    private  String year;
    private String motor;
    private String color;
    private boolean is4X4;
    private String additions;

    public CarList(String model, String year, String motor, String color, boolean is4X4, String additions) {
        this.model = model;
        this.year = year;
        this.motor = motor;
        this.color = color;
        this.is4X4 = is4X4;
        this.additions = additions;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isIs4X4() {
        return is4X4;
    }

    public void setIs4X4(boolean is4X4) {
        this.is4X4 = is4X4;
    }

    public String getAdditions() {
        return additions;
    }

    public void setAdditions(String additions) {
        this.additions = additions;
    }
}

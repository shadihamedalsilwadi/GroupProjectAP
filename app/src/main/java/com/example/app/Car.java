package com.example.app;

public class Car {
    private  String model;
    private  String year;
    private String motor;

    public Car() {
    }

    public Car(String model, String year, String motor) {
        this.model = model;
        this.year = year;
        this.motor = motor;
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

    @Override
    public String toString() {
        return  model ;
    }
}

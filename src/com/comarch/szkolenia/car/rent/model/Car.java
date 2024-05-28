package com.comarch.szkolenia.car.rent.model;

public class Car {
    private String brand;
    private String model;
    private String plate;
    private boolean rent;

    public Car() {
    }

    public Car(String brand, String model, String plate, boolean rent) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.rent = rent;
    }

    public Car(String brand, String model, String plate) {
        this.brand = brand;
        this.model = model;
        this.plate = plate;
        this.rent = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }
}

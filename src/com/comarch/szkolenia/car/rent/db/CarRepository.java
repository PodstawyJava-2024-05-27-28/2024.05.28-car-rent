package com.comarch.szkolenia.car.rent.db;

import com.comarch.szkolenia.car.rent.model.Car;

public class CarRepository {
    private Car[] cars = new Car[3];

    public CarRepository() {
        this.cars[0] = new Car("Audi", "A5", "KR11");
        this.cars[1] = new Car("BMW", "5", "KR2");
        this.cars[2] = new Car("Toyota", "Corolla", "KR33");
    }

    public Car[] getCars() {
        return this.cars;
    }

    public void rent(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate)) {
                car.setRent(true);
                break;
            }
        }
    }
}

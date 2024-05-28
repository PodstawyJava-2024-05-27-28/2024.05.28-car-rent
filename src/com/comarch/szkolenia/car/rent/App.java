package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.db.CarRepository;
import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. List");
            System.out.println("2. Rent");
            System.out.println("3. Exit");

            switch (scanner.nextLine()) {
                case "1":
                    for (Car car : carRepository.getCars()) {
                        System.out.println(car.getBrand() + " " +
                                car.getModel() + " " + car.getPlate() + " " + car.isRent());
                    }
                    break;
                case "2":
                    System.out.println("Enter plate:");
                    carRepository.rent(scanner.nextLine());
                    break;
                case "3":
                    return;
            }
        }
    }
}

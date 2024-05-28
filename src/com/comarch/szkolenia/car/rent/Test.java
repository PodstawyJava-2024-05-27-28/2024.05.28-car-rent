package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.model.Car;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

        System.out.println(car.equals(car2));

        String s1 = new String("ABC");
        String s2 = new String("ABC");

        System.out.println(s1.equals(s2));
    }
}

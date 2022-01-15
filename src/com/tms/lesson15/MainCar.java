package com.tms.lesson15;

import com.tms.lesson15.config.JDBCConfig;
import com.tms.lesson15.entity.Car;
import com.tms.lesson15.entity.TYPE;
import com.tms.lesson15.persistance.CarService;
import com.tms.lesson15.persistance.Entity;

import java.sql.Connection;
import java.util.List;

public class MainCar {

    public static void main(String[] args) {
        Connection connection = JDBCConfig.getConnect();


        Entity<Car> carService = new CarService(connection);
        Car car = new Car(1, "model1", TYPE.PASSENGER, "1995-11-09");
        Car car1 = new Car(2, "model2", TYPE.TRUCK, "2012-10-06");
        Car car2 = new Car(3, "model3", TYPE.PASSENGER, "2008-12-28");
//        carService.save(car);
//        carService.save(car1);
//        carService.save(car2);
//        carService.delete(car);
//        carService.delete(car1);
//        carService.delete(car2);


//        car.setModel("new model");
//        car.setType(TYPE.TRUCK);
//        car.setYear("2001-12-08");
//        car.setId(1);
//        carService.update(car);

        List<Car> cars = carService.getAll();
        System.out.println(cars);


    }

}

package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    default List<Car> listCars() {
        return Car.getCarsList();
    }

    List<Car> listCarsFirst(int count);
}

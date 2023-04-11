package service.abstracts;

import entities.Car;

import java.util.List;

public interface CarService {
    void add(Car car);

    List<Car> getAll();

    Car getById(int id);
}

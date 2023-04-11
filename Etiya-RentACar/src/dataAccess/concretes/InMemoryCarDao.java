package dataAccess.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class InMemoryCarDao implements CarDao {

    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void create(Car car) {
        cars.add(car);
    }

    @Override
    public Car update(Car car, String name) {
        car.setName(name);
        return car;
    }

    @Override
    public void delete(int id) {
        cars.remove(id);
    }

    @Override
    public Car getById(int id) {
        return cars.stream()
                .filter(car -> car.getId() ==id)
                .findFirst()
                .orElseThrow();
    }
}

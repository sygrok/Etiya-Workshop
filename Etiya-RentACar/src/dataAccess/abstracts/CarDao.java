package dataAccess.abstracts;

import entities.Car;

import java.util.List;

public interface CarDao {

    List<Car> getAll();

    void create(Car car);

    Car update(Car car, String name);

    void delete(int id);

    Car getById(int id);
}

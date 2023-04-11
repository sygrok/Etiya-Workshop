package service.concretes;

import dataAccess.abstracts.CarDao;
import entities.Car;
import service.abstracts.CarService;

import java.util.List;

public class CarManager implements CarService {

    private final CarDao carDao;

    public CarManager(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void add(Car car) {
        if (car.getName() == null) {
            System.out.println("İsim alanı boş bıraklamaz!");
            return;
        }
        carDao.create(car);
    }

    @Override
    public List<Car> getAll() {
        return carDao.getAll();
    }

    @Override
    public Car getById(int id) {
        return carDao.getById(id);
    }
}

package service.concretes;

import dataAccess.abstracts.TruckDao;
import entities.Truck;
import service.abstracts.TruckService;

import java.util.List;

public class TruckManager implements TruckService {

    private final TruckDao truckDao;

    public TruckManager(TruckDao truckDao) {
        this.truckDao = truckDao;
    }


    @Override
    public void add(Truck truck) {
        if (truck.getName() == null) {
            System.out.println("İsim alanı boş bıraklımaz!");
            return;
        }else { truckDao.create(truck);}

    }

    @Override
    public List<Truck> getAll() {
        return truckDao.getAll();
    }

    @Override
    public Truck getById(int id) {
        return truckDao.getById(id);
    }
}

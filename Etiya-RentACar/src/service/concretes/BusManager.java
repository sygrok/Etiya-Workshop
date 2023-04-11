package service.concretes;

import dataAccess.abstracts.BusDao;
import entities.Bus;
import service.abstracts.BusService;

import java.util.List;

public class BusManager implements BusService {

    private final BusDao busDao;

    public BusManager(BusDao busDao) {
        this.busDao = busDao;
    }

    @Override
    public void add(Bus bus) {
        if(bus.getName() == null) {
            System.out.println("İsim alanı boş bırakılamaz!");
            return;
        }else{
            busDao.create(bus);
        }
    }

    @Override
    public List<Bus> getAll() {
        return busDao.getAll();
    }

    @Override
    public Bus getById(int id) {
        return busDao.getById(id);
    }
}

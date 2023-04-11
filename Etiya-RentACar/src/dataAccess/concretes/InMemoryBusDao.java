package dataAccess.concretes;

import dataAccess.abstracts.BusDao;
import entities.Bus;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBusDao implements BusDao {

    List<Bus> buses = new ArrayList<>();



    @Override
    public List<Bus> getAll() {
        return buses;
    }

    @Override
    public void create(Bus bus){
        buses.add(bus);
    }

    @Override
    public Bus update(Bus bus, String name){
        bus.setName(name);
        return bus;
    }

    @Override
    public void delete(int id) {
        buses.remove(id);
    }

    @Override
    public Bus getById(int id){
        return buses.stream()
                .filter(bus -> bus.getId() == id)
                .findFirst()
                .orElseThrow();
    }



}

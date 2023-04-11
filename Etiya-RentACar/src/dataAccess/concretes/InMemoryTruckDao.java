package dataAccess.concretes;

import dataAccess.abstracts.TruckDao;
import entities.Truck;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTruckDao implements TruckDao {

    List<Truck> trucks = new ArrayList<>();

    @Override
    public List<Truck> getAll() {
        return trucks;
    }

    @Override
    public void create(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public Truck update(Truck truck, String name) {
        truck.setName(name);
        return truck;
    }

    @Override
    public void delete(int id) {
        trucks.remove(id);
    }

    @Override
    public Truck getById(int id) {
        return trucks.stream()
                .filter(truck -> truck.getId() == id)
                .findFirst()
                .orElseThrow();
    }
}

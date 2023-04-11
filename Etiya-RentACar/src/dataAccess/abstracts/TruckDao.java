package dataAccess.abstracts;

import entities.Truck;

import java.util.List;

public interface TruckDao {

    List<Truck> getAll();

    void create(Truck truck);

    Truck update(Truck truck, String name);

    void delete (int id);

    Truck getById(int id);
}

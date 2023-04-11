package service.abstracts;

import entities.Truck;

import java.util.List;

public interface TruckService {

    void add (Truck truck);

    List<Truck> getAll();

    Truck getById(int id);
}

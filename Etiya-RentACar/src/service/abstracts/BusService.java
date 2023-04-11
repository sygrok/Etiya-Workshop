package service.abstracts;

import entities.Bus;

import java.util.List;

public interface BusService {

    void add(Bus bus);

    List<Bus> getAll();

    Bus getById(int id);
}

package dataAccess.abstracts;

import entities.Bus;

import java.util.List;

public interface BusDao {

    List<Bus> getAll();

    void create(Bus bus);

    Bus update (Bus bus, String name);

    void delete(int id);

    Bus getById(int id);

}

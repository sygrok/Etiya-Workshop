package consoleUi;

import dataAccess.abstracts.BusDao;
import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.TruckDao;
import dataAccess.concretes.InMemoryBusDao;
import dataAccess.concretes.InMemoryCarDao;
import dataAccess.concretes.InMemoryTruckDao;
import entities.Bus;
import entities.Car;
import entities.Truck;
import service.abstracts.BusService;
import service.abstracts.CarService;
import service.abstracts.TruckService;
import service.concretes.BusManager;
import service.concretes.CarManager;
import service.concretes.TruckManager;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1, "TOGG");
        Bus bus1 = new Bus(2, "Mercedes", "O403");
        Truck truck1 = new Truck(3, "MAN" , "Wood");
        Car car2 = new Car(4, "BMW");
        Bus bus2 = new Bus(5,"Deutz", "M2000");
        Truck truck2 = new Truck(6, "Scania", "Container");


        CarDao inMemoryCarDao = new InMemoryCarDao();
        BusDao inMemoryBusDao = new InMemoryBusDao();
        TruckDao inMemoryTruckDao = new InMemoryTruckDao();


        CarService carService = new CarManager(inMemoryCarDao);
        BusService busService = new BusManager(inMemoryBusDao);
        TruckService truckService = new TruckManager(inMemoryTruckDao);


        carService.add(car1);
        busService.add(bus1);
        truckService.add(truck1);
        carService.add(car2);
        busService.add(bus2);
        truckService.add(truck2);



        for (Car car : carService.getAll()){
            System.out.println(car.getId() + " " + car.getName());
        }

        for (Bus bus : busService.getAll()) {
            System.out.println(bus.getId() + " " + bus.getName() + " " + bus.getModel());
        }

        for (Truck truck : truckService.getAll()) {
            System.out.println(truck.getId() + " " + truck.getName() + " loading " + truck.getLoad());
        }



    }
}
package entities;

public class Truck extends Car{

    private String load;

    public Truck(int id, String name, String load) {
        super(id, name);
        this.load = load;
    }

    public String getLoad() {
        return  load;
    }

    public void setLoad(String load) {
        this.load = load;
    }

}

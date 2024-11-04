package lesson20.transport;

public class Vehical {
    private String model;
    private int year;

    public Vehical(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString(){
        return model + ", year of manufacture is " + year;
    }
    public void start(){
        System.out.println(model + " starts moving");
    }
    public void stop(){
        System.out.println(model + " stops");
    }

}

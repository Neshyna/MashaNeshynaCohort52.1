package consult16;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    private int speed;

    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    //compare by year
    @Override
    public int compareTo(Car car1) {
        return this.year - car1.year;

        /*
        a vs b
        a < b -> negative value
        a > b -> positive value
        a == b -> return 0
         */
    }
}

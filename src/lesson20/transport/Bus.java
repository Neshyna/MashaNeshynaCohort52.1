package lesson20.transport;
// bus is-a vehicle
public class
Bus extends Vehical {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity) {
        //create first obj parent
        super(model, year);//get constructor parent class
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public boolean takePassenger(){
        //check if there are free places
        if(countPassengers < capacity){
            countPassengers++;
            System.out.println("passenger got into the bus " + this.getModel());
            return true;
        }
        System.out.printf("no place in bus %s. now %d people " , this.getModel(), countPassengers);
        return  false;
    }

    public boolean dropPassenger(){
        //check if there are passengers in the bus
        if(countPassengers > 0){
            countPassengers--;
            System.out.println("man is out");
            return true;
        }
        System.out.println("no men to out");
        return false;
    }
}

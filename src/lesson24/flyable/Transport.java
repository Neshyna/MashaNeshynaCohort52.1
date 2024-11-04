package lesson24.flyable;

public abstract class Transport {

    int capacity;
    int amount;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract boolean takePassengers();

    public int countPassengers(){
        return amount;
    }
}

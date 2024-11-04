package lesson24.flyable;

public class Airplane extends  Transport implements  FLyable{


    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    boolean takePassengers() {

        if (amount < capacity){
            amount++;
            return true;
        }
        return false;
    }

    @Override
    public void fly() {
        System.out.println("airplane fly");
    }
}

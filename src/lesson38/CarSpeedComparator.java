package lesson38;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        return car1.getSpeed() - car2.getSpeed();
        /*
        car1 < car2 -> negative
        car1 < car2 -> positive
        car1 == car2 -> 0

        return car2.getSpeed() - car1.getSpeed();
        от большего к меньшему

        return car1.getSpeed() - car2.getSpeed();
        от меньшего к большему


         */
    }
}

package lesson38;

import java.util.Comparator;

public class CarModelComparator implements Comparator<Car> {

    @Override
    public int compare(Car car1, Car car2) {
        //String Integer done by interface Comparable
        String model1 = car1.getModel();
        String model2 = car2.getModel();

        return model1.compareTo(model2);

        //String done by default lexicographic string comparison
    }
}

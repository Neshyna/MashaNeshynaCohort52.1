package lesson38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {

        int[] numbers = {9, 5, 1, 2, 3, 0, 4};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"apple", "ccc", " apple", "Zebra"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Cirtoen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrary", 2024, 300);

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("==============");

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("=============");
        CarModelComparator carModelComparator = new CarModelComparator();
        Arrays.sort(cars, carModelComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("\n===========Anonymous class ===============\n");
        //Anonymous class
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        System.out.println(Arrays.toString(cars));

        System.out.println("compare cars by year. then from smallest to biggest");
        //compare cars by year. then from smallest to biggest
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int yearCompare = car1.getYear() - car2.getYear();
                if (yearCompare == 0) {
                    //years are equals
                    return car2.getModel().compareTo(car1.getModel());
                }
                return yearCompare;
            }
        });
        System.out.println(Arrays.toString(cars));

        //functional interface - has only one abstract method

        System.out.println("лямбда");
        //лямбда выражения способ краткой записи анонимных фунций
        //used only to make functional interfaces
        //(parameter) -> {body}

        Arrays.sort(cars, (car1, car2) -> car1.getSpeed() - car2.getSpeed());
        System.out.println(Arrays.toString(cars));

        // when {} - must be used with return
        Arrays.sort(cars, (car1, car2) -> {
            return car1.getSpeed() - car2.getSpeed();
        });


        Arrays.sort(cars, (c1, c2) -> {
            int yearCompare = c1.getYear() - c2.getYear();
            if (yearCompare == 0) {
                //years are equals
                return c2.getModel().compareTo(c1.getModel());
            } else {
                return yearCompare;
            }
        });

        System.out.println("liambda/sort car by year from small to big/when year equal, sort by speed from small to big");
        Comparator<Car> comparator = (car1, car2) -> {
            int yearCompare = car1.getYear() - car2.getYear();
            //alternative option to compare int
            yearCompare = Integer.compare(car1.getYear(), car2.getYear());
            if (yearCompare == 0) {
                //years are equals
                return Integer.compare(car1.getSpeed(), car2.getSpeed());
            }
            return yearCompare;
        };
        Arrays.sort(cars,comparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("liambda sort by year");
        Comparator<Car> comparator2 = (car1, car2) -> {

            int yearCompare = car2.getYear() - car1.getYear();
            return yearCompare;
        };
        Arrays.sort(cars,comparator2);
        System.out.println(Arrays.toString(cars));

        System.out.println("comparator static methods");
        Arrays.sort(cars,Comparator.comparing(Car::getYear).reversed());
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars,Comparator.comparing(Car::getYear).thenComparing(Car::getModel));
        System.out.println(Arrays.toString(cars));
    }
}


package hw38;

import java.util.Arrays;
import java.util.Comparator;

public class SportMain {
    public static void main(String[] args) {

        Sportsman[] sportsmen = new Sportsman[3];
        sportsmen[0] = new Sportsman("Jacob",30,10);
        sportsmen[1] = new Sportsman("Edward", 40, 20);
        sportsmen[2] = new Sportsman("Bella", 50, 30);

        //class Comparator, by score
        System.out.println("Sorted by score: ");
        SportScoreComparator scoreComparator = new SportScoreComparator();
        Arrays.sort(sportsmen, scoreComparator);
        System.out.println(Arrays.toString(sportsmen));

        //order defined at Comparable, by name
        System.out.println("Sorted by name: ");
        Arrays.sort(sportsmen);
        System.out.println(Arrays.toString(sportsmen));

        //anonymous class, sort by age
        System.out.println("Sorted by age: ");
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {
            @Override
            public int compare(Sportsman s1, Sportsman s2) {
                return s1.getAge() - s2.getAge();
            }
        });
        System.out.println(Arrays.toString(sportsmen));


    }
}

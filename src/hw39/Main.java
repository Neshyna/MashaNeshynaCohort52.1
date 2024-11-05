package hw39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> c1 = new ArrayList<>(java.util.List.of(1,2,3,4,5));
        List<Integer> c2 = new LinkedList<>(java.util.List.of(4,5,6,7,8));

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        c1.retainAll(c2);
        System.out.println("c1.retain(c2): " + c1);
    }
}

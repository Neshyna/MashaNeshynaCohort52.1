package hw39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void retainLists(List<Integer> c1, List<Integer> c2){
        /*
        Task 1
        Напишите метод, который принимает на вход две реализации интерфейса List.
        Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.
         */

        c1.retainAll(c2);
        System.out.println("c1.retain(c2): " + c1);
    }

    public static void main(String[] args) {

        List<Integer> c1 = new LinkedList<>(java.util.List.of(1,2,3,4,5));
        List<Integer> c2 = new LinkedList<>(java.util.List.of(4,5,6,7,8));
        System.out.println("c1" + c1);
        System.out.println("c2 " + c2);
        retainLists(c1,c2);

    }
}

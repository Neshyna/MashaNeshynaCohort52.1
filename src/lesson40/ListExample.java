package lesson40;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {

        //link type defines:
        // 1. what kind of link can be safe to this variable
        // 2. a number of available methods
        //Collection<Integer> collection = new ArrayList<>();
        //collection = new HashSet<>();
        //collection = new PriorityQueue<>();
        //Collection<Integer> iterable = new ArrayList<>();

        //constructors ArrayList
        List<Integer> list = new ArrayList<>();//list  with default capacity
        list = new ArrayList<>(10);//empty list with capacity 10
        list = new ArrayList<>(List.of(1,-10,5,0,25,-100));//accept collection

        //linked list
        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1,-10,5,0,25,-100));
        list = new LinkedList<>(Set.of(1,-10,5,0,25,-100));//add disordered

        //methods of list interface
        //boolean E add in the end of list
        list.add(1000);
        list.add(-100);

        System.out.println("List: " + list);

        //void add (int index, E element) - add element to the defined position
        list.add(2,100);
        System.out.println(list);

        //E get(int index) - return element by index
        int value = list.get(5);
        System.out.println("list.get(5): " + value);

        //E remove (int index) - delete element by index, return old value
        System.out.println(list.remove(5));
        System.out.println(list);

        //method delete by value (from interface Collection)
        //accept Object (link type)
        list.remove(Integer.valueOf(1000));
        System.out.println(list);

        //search element by value. return index
        //int indexOf (Object obj)
        //int lastIndexOf(Object obj)
        System.out.println("indexOf: " + list.indexOf(-100));
        System.out.println("lastOf: " + list.lastIndexOf(-100));

        //void sort(Comparator<? super E> comparator - sort list using defined comparator)
        list.sort((i1,i2)-> i2.compareTo(i1));
        System.out.println(list);

        //List<E> subList(int indexFrom, int indexTo) - return list of elements inside from ... to positions
        List<Integer> subList = list.subList(1,5);
        System.out.println(subList);


    }
}

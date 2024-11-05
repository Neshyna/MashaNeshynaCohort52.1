package lesson39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        //interface collection guarantee existence of
        // number of basic methods for all it's interfaces

        //create string collection

        Collection <String> strings = new ArrayList<>();
        //link interface type -> object of different class(different way to do this interface)

        //int size () - returns a number of elements in collection
        System.out.println("string.size(): " + strings.size());

        //boolean isEmpty() - return true? when collection is empty
        System.out.println("string.isEmpty(): " + strings.isEmpty());


        //boolean add(T t) add element to collection
        strings.add("Java");
        strings.add("Python");

        //remade method toString to print collection nicely
        System.out.println(strings);

        //method .of() static method creates unchangeable collection with given elements
        Collection<Integer> integers = List.of(1,2,3,4,5);
        System.out.println("Intrgers: " + integers);
        //this collection can't be changed, .add -> not possible

        //addAll(Collection<? extends T>col) ->
        // add all elements from defined collection to current collection
        strings.addAll(List.of("JS","Cat","Banana"));
        System.out.println(strings);

        //boolean removeAll(Collection<?> col)
        //deletes all elements from one collection that exist in another collection
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0,1,2,3,4,5));
        System.out.println("numbers: " + numbers);
        numbers.removeAll(List.of(1,2,3));
        System.out.println("numbers.removeAll(List.of(1,2,3)): " + numbers);

        //boolean retainAll(Collection<?>col)
        //remain only the number of elements that both collections contains
        //and removes all elements from one collection that are not at second collections
        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(1,2,3,4,3,5));
        colB.addAll(List.of(1,2,3));
        System.out.println("colA: " + colA);
        System.out.println("colB: " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB): " + colA);

        //boolean remove(Object obj) - removes element from the collection
        //return true if the element had existed
        System.out.println("colA.remove(100): " + colA.remove(100));
        System.out.println("colA.remove(3): " + colA.remove(3));
        System.out.println("colA: " + colA);

        //all constructors accept another collection
        Collection<String> strings1 = new ArrayList<>(List.of("T1","T2","T3"));
        //creates collection that contain all elements from another collection
        System.out.println("strings1: " + strings1);
        strings1.add("T4");
        System.out.println("strings1: " + strings1);

        //create new collection by copy of another collection plus add one new element
        Collection<String> stringCopy = new ArrayList<>(strings1);
        stringCopy.add("T5");
        System.out.println("stringCopy: " + stringCopy);

    }
}

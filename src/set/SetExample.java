package set;

import java.util.*;

public class SetExample {
     /*
    Контракт между equals() и hashCode()
    Для корректной работы хэш- коллекций есть важное правило, состоящее из 3 условий:
    1. Если два объекты равны по методу equals, то их хеш-коды тоже должны быть равны.
    2. Если хеш-коды двух объектов различны, то объекты точно не равны по equals.
    Обратное не всегда верно. Разные объекты могут иметь одинаковый хеш-код (коллизия)
    3. Вызов методы hasCode должен возвращать одинаковое значение при многократном вызове на неизмененном объекта

     */


    public static void main(String[] args) {
        //constructor
        Set<Integer> set = new HashSet<>();//empty hashset capacity 16 and coefficient upload
        set = new HashSet<>(20);//empty hashset with defined capacity
        set = new HashSet<>(List.of(1,2,3,5,6,6,5,3));//set has unique element from collection, no duplicates printed

        System.out.println(set);//print 1 2 3 5 6 no duplicates

        List<Integer> startValues = new ArrayList<>(List.of(15,1,2,3,4,3,8,6,15,7,0,16,32));
        System.out.println(startValues);

        //Hashset add elements with no order
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashset: " + integers);

        //safes order
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        //boolean add (E e) - add element
        System.out.println("integers.add(100): " + integers.add(100));//true - element added, because element is new
        System.out.println(integers);
        System.out.println("integers.add(100):#2  " + integers.add(100));//false - duplicates not added
        System.out.println("integers: " + integers);

        //boolean remove (Object obj) by value
        System.out.println("integers.remove(100): " + integers.remove(100));//true remove
        System.out.println(integers);
        System.out.println("integers.remove(100): #2" + integers.remove(100));//false
        System.out.println(integers);

        System.out.println("==============");
        //boolean contains(Object obj) - check if there is value
        System.out.println(integers.contains(100));//false
        System.out.println(integers.contains(32));//true

        /*
        int size() - number elements
        boolean isEmpty() - true, if empty
        clear() - delete all
         */

        //iterator() - return iterator for element set-a
        //iterator availability helps to run through all elements with for each loop
        for (Integer value : integers){
            System.out.print(value + ", ");
        }
        System.out.println();

        System.out.println("startValues: " + startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println("resultList: "  + resultList);

        //sortedSet.constructor
        //constructor with default order if comparator is created

        SortedSet<Integer> sortedSet = new TreeSet<>();
        //empty ordered multiplicity (natural order)
        sortedSet.addAll(startValues);
        System.out.println("sortedSet: " + sortedSet);

        //constructor accept collection natural order
        sortedSet = new TreeSet<>(startValues);
        System.out.println("sortedSet: " + sortedSet);

        //constructor with comparator to define order
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());//reverse order
        //(i1,i2) -> i2 - i1
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println("treeset: " + treeSet);

        //first()/last() - return first/last smallest element (on the left / as Comparator decides)
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        SortedSet<Integer> integerSortedSet = new TreeSet<>(startValues);
        System.out.println(integerSortedSet);

        // SortedSet<E> headset (E element) -return a part of multiplicity, where elements smaller than an element
        System.out.println(integerSortedSet.headSet(8));

        //SortedSet<E> tailSet(E element) - return new multiplicity, where numbers bigger than an element or equal
        SortedSet<Integer> tailSet = integerSortedSet.tailSet(8);
        System.out.println(tailSet);

        //subSet (E fromElement to Element) - return multiplicity (from one E including ... to another E not including)
        System.out.println(integerSortedSet.subSet(3,16));

        //comparator() - return comparator, to order element in the multiplicity
        //return null when using natural order
        System.out.println(integerSortedSet.comparator());


    }
    //create method, accept list and return list,
    // contains only unique elements of both lists

    public static <T> List<T> getUniqueList(List<T> list){
        //return set, with only unique elements
        Set<T> set = new LinkedHashSet<>(list);
        //return new list with all set elements
        return new ArrayList<>(set);

    }

    public static void test(){
        String testString = "test string with words";
        //replace all not letters into emptiness
        String newString = testString.replaceAll("[^ a-zA-Z0-9a-яА-Я]", " ");
        System.out.println(newString);
        //create array
        String [] words = testString.split(" ");
        System.out.println(Arrays.toString(words));
        //make collection from array
        List<String> list = Arrays.asList(words);
        System.out.println(list);

    }

}

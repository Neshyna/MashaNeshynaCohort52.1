package hw26;
import hw25.MagicArrayGen;
import hw25.MyListClassGen;
import hw26.PrintTwoLists;

import static hw26.PrintTwoLists.printTwoLists;

public class PrintTwoListMain {

    public static void main(String[] args) {

   MyListClassGen<String> list1 = new MyListClassGen<>();
    list1.add("Pond");
    list1.add("Fuiaz");
    list1.add("Bible");

    MyListClassGen<Double> list2 = new MyListClassGen<>();
    list2.add(1.23);
    list2.add(3.45);
    list2.add(4.78);

    printTwoLists(list1,list2);

}

}

package lesson29;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class forEachExample {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        //for-each(variable type : collection)

        for (String s : list){
            System.out.println(s);
        }
        //for each loop must not change collection(cant delete or add elements)
        //should not do like that
        for (String s : list){
            if (s.equals("World")){
                list.remove(s);
            }
        }
    }



}

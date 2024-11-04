package hw26;

import hw25.MyListClassGen;
import lesson26.MyArrayList;

/*
Task 2. * Опционально
Обобщенный статический метод “Печать двух списков”
Напишите обобщенный статический метод printTwoLists,
который принимает два параметра типа MyArrayList и MyArrayList,
 и выводит элементы обоих списков.

Требования:

Метод должен быть обобщенным по двум типам T и U.
Элементы списков могут быть разных типов.
 */
public class PrintTwoLists {

    public static <T,U> void printTwoLists(MyListClassGen<T> array, MyListClassGen<U> array2){

        if (array == null || array.isEmpty()){

            if (array2 == null || array2.isEmpty()) {
                System.out.println( "[]");
            }
            printArray(array2);
        }
        if (array2 == null || array2.isEmpty()) {
            printArray(array);
        }

        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
            //sb.append((i < array.size() - 1)|| array2.size > 0 );//in case array 2 is empty
            sb.append(",");

        }
        for (int i = 0; i < array2.size(); i++) {
            sb.append(array2.get(i));
            sb.append((i < array2.size() - 1) ? ", " : "]");

        }
        System.out.println(sb.toString());
    }
    public static String printArray(MyListClassGen array) {
        if (array == null || array.size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");

        for (int i = 0; i < array.size(); i++) {
            sb.append(array.get(i));
            sb.append((i < array.size() - 1) ? ", " : "]");
        }

        return sb.toString();
    }
}

package hw16_Neshyna_cohort52_1;

import lesson12.ArraysUtils;
import lesson16.MagicArray;

import java.util.Arrays;

public class HW16_Task0 {

    int[] array;
    int cursor ;


    public HW16_Task0() {

        array = new int[4];//array created with n elements

    }

    void addElement(int element) {

        if (cursor == array.length -1){
            magicArray();
        }

        array[cursor] = element;
        cursor++;
    }

    public String printArray(int [] array) {

        if (cursor <= 0) {
            return "[]"; // Return empty array representation if cursor is 0 or negative
        }

        String printArray = "[";
        for (int k = 0; k < cursor; k++) {
            printArray = printArray + array[k] + (k < cursor - 1 ? "," : "]");

        }
        return printArray;
    }
    public int indexOf(int value, int[] array){

        int i = 0;

        while ( i < cursor){

            if (array[i] == value){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int valueOf(int index){

        for (int i = 0; i < array.length; i++){
            if(index >= 0 && i < cursor){
                return array[index];
            }return  -1;
        }return index;
    }

    public int currentNumberOfElements(){
        return cursor;
    }

    void addMultipleElements(int ... numbers){
        for (int i = 0 ; i < numbers.length; i++){
            addElement(numbers[i]);
        }
    }

    void magicArray() {

        int[] magicArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++) {
            magicArray[i] = array[i];
        }
        array = magicArray;
    }

     public int removeByIndex (int indexToDelete){

        int oldValue = array[indexToDelete];
        if( indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("index not found");

        }

        int [] newArray = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length ;i++){
            if(i != indexToDelete){
                newArray[j++] = array[i];
            }
        }

        //moves cursor and allow to print array without 0 in the end
        for (int i = indexToDelete; i < cursor -1; i++){
            array[i] = array[i + 1];
        }
        cursor--;

        System.out.println("remove by index: " + printArray(newArray));
        return oldValue;//return old value
    }


    public int[] removeByValue (int valueToDelete){


        int indexToDelete = indexOf(valueToDelete,array);
        for(int i = 0; i < array.length; i++){
            if (array[i] == valueToDelete){
               indexToDelete = i;
               break;
            }
        }
        int [] newArray2 = new int[array.length -1];

        int j = 0;
        for (int i = 0; i < array.length ;i++){
            if(i != indexToDelete){
                newArray2[j++] = array[i];
            }
        }

        //moves cursor and allow to print array without 0 in the end
        for (int i = indexToDelete; i < cursor -1; i++){
            array[i] = array[i + 1];
        }
        cursor--;

        System.out.println("remove by value: " + printArray(newArray2));
        return newArray2;
    }
    boolean removeBV(int value){
        int index = indexOf(value,array);
        if(index == -1)
            return false;//if there is element with the value in the array

        removeByIndex(index);
        return true;


    }

    int remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            int value = array[index]; // значение, которое я должен вернуть

            // Перебираем элементы начиная с индекса и перезаписываем значениями из соседней правой ячейки
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов?
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // возвращаем старое значение

        } else {
//           Индекс не валидный
            // Todo поправить возвращаемое значение при невалидном индексе
            return Integer.MIN_VALUE;
        }

    }
    // Метод поиска по значению. Поиск последнего вхождения
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
    int lastIndexOf(int value) {

        for(int i = cursor -1; i >= 0 ;  i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

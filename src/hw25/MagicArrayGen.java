package hw25;

public class MagicArrayGen<T> {

    private T[] array;
    int cursor ;

@SuppressWarnings("unchecked")//remove warnings
    public void MagicArrayGen() {

        array = (T[])new Object[4];//array created with n elements

    }

    void addElement(T element) {

        if (cursor == array.length -1){
            expandArray();
        }

        array[cursor] = element;
        cursor++;
    }

    public String printArray(T [] array) {

        if (cursor <= 0) {
            return "[]"; // Return empty array representation if cursor is 0 or negative
        }

        String printArray = "[";
        for (int k = 0; k < cursor; k++) {
            printArray = printArray + array[k] + (k < cursor - 1 ? "," : "]");

        }
        return printArray;
    }
    public int indexOf(T value, T[] array){

        int i = 0;

        while ( i < cursor){

            if (this.array[i] == value){
                return i;
            }
            i++;
        }
        return -1;
    }
    public int valueOf(int index){

        for (int i = 0; i < array.length; i++){
            if(index >= 0 && i < cursor){
                return (int) array[index];
            }return  -1;
        }return index;
    }

    public int currentNumberOfElements(){
        return cursor;
    }

    void addMultipleElements(T ... numbers){
        for (int i = 0 ; i < numbers.length; i++){
            addElement(numbers[i]);
        }
    }

    void expandArray() {

        T[] magicArray = (T[]) new Object[array.length * 2];//why should I turn array to object?

        for (int i = 0; i < cursor; i++) {
            magicArray[i] = array[i];
        }
        array = magicArray;
    }

     public T removeByIndex (int indexToDelete){

        T oldValue = array[indexToDelete];
        if( indexToDelete < 0 || indexToDelete >= array.length) {
            System.out.println("index not found");

        }

         T [] newArray = (T[]) new Object [array.length -1];

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


    public T[] removeByValue (T valueToDelete){


        int indexToDelete = indexOf(valueToDelete,array);
        for(int i = 0; i < array.length; i++){
            if (array[i] == valueToDelete){
               indexToDelete = i;
               break;
            }
        }
        T [] newArray2 = (T[]) new Object [array.length -1];

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
        return newArray2;//returns new array without deleted element, not secure as well as array can be changed by user
    }
    boolean removeBV(T value){
        int index = indexOf(value,array);
        if(index == -1)
            return false;//if there is element with the value in the array

        removeByIndex(index);
        return true;


    }

    public T remove(int index) {
        /*
        1. Проверка индекса на валидность
        2. Удалить значение по индексу
        3. Передвинуть курсор (т.к. кол-во элементов уменьшилось)
        4. Вернуть старое значение
        */

        if (index >= 0 && index < cursor) {
            // Логика удаления
            T value = array[index]; // значение, которое я должен вернуть

            // Перебираем элементы начиная с индекса и перезаписываем значениями из соседней правой ячейки
            for (int i = index; i < cursor - 1; i++) { // граница перебора индексов?
                array[i] = array[i + 1];
            }
            cursor--;

            return value; // возвращаем старое значение

        } else {
//           Индекс не валидный
            throw new IndexOutOfBoundsException("Index not valid: " + index);
           // return... ;//what to put here? don't know
        }

    }
    // Метод поиска по значению. Поиск последнего вхождения
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
    int lastIndexOf(T value) {

        for(int i = cursor -1; i >= 0 ;  i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

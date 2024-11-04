package lesson16;

public class MagicArray {
    int[] array;
    int cursor;//default value = 0

    public MagicArray(){
        array = new int[5];

    }
    void add(int value){
        //add one element
        //check if there is free space in the array
        //if not , need to add free space

        if (cursor == array.length -1){
            //make the array wider/larger//expand array
            expandArray();
        }
        array[cursor] = value;
        cursor++;
    }
    //dynamic expand array

    void add(int ... numbers){
        //to work with numbers is the same as int array link
        //System.out.println("several int values accepted. exactly : " + numbers.length);
        //System.out.println("each int has index as at array. index 0: " + numbers[0]);

        for (int i = 0 ; i < numbers.length; i++){
            add(numbers[i]);
        }
    }

    void expandArray(){
        System.out.println("expand array. cursor: " + cursor);
        //create new array twice larger
        //rewrite all values to new array from old array(till cursor)
        //new link

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        //give link. variable array keeps link of a new array
        System.out.println("array expand finished");
    }
    public  String toString(){
        //return string array representation

        if (cursor==0) return "[]";
        //in case of empty array

        String result = "[";
        for (int i = 0 ; i < cursor; i++){
            result = result + array[i] + (i < cursor -1 ? "," : "]");
        }
        return result;
    }
    int size(){
        return cursor;
    }

    //return value by index
    int get(int index){
        if(index >= 0 && index < cursor){
            return  array[index];
        }
        return Integer.MIN_VALUE;
        //there is no good variant for else case
        //need to think how to describe this case better
        //how to work correctly with index when it is incorrect
        //in case index is incorrect
    }
    int remove (int index){
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

    // Поиск по значению. Первое вхождение
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс первого найдено вхождения = 1
    int indexOf(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
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

    // Удаление элемента по значению
    boolean removeByValue(int value) {
        /*
        1. Есть ли элемент с таким значение в массиве - indexOf
        2. Если элемента нет - вернуть false
        3. Если элемент есть - удалить и вернуть true - вызвать удаление по индексу
         */
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }


}

/*
1. Добавлять в массив элемент (не думая об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы тым есть) ++
4. Добавляем в массив сразу несколько значений. ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу ++
7. Удаляет элемент по индексу ++ (Есть индекс - удалить этот элемент из массива). Вернуть старое значение (удаленное)
8. Конструктор, принимающий массив ++
9. Удаление по значению
10. Поиск по значению. Возвращает индекс ++

 */

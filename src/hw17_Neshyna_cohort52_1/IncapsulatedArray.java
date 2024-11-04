package hw17_Neshyna_cohort52_1;
/*
Task 1
Инкапсулировать класс нашего магического массива
 */

public class IncapsulatedArray {
    private int[] array;
    private int cursor;//default value = 0

    public IncapsulatedArray(){
        array = new int[1];

    }
    public void setValue(int value){
        //add one element
        //check if there is free space in the array
        //if not , need to add free space

        if (cursor == array.length -1){
            //make the array wider/larger//expand array
            expandArray();
        }
        this.array[cursor] = value;
        this.cursor++;
    }
    //dynamic expand array

    public void setMultipleValues(int ... numbers){
        //to work with numbers is the same as int array link
        //System.out.println("several int values accepted. exactly : " + numbers.length);
        //System.out.println("each int has index as at array. index 0: " + numbers[0]);

        for (int i = 0 ; i < numbers.length; i++){
            setValue(numbers[i]);
        }
    }

    private void expandArray(){
        //System.out.println("expand array. cursor: " + cursor);
        //create new array twice larger
        //rewrite all values to new array from old array(till cursor)
        //new link

        int[] newArray = new int[array.length * 2];

        for (int i = 0; i < cursor; i++){
            newArray[i] = array[i];
        }
        array = newArray;
        //give link. variable array keeps link of a new array
       // System.out.println("array expand finished");
    }
    public String getPrintedArray(){
        //return string array representation

        if (cursor==0) return "[]";
        //in case of empty array

        String result = "[";
        for (int i = 0 ; i < cursor; i++){
            result = result + array[i] + (i < cursor -1 ? "," : "]");
        }
        return result;
    }
    public int getSize(){
        return cursor;
        //return array.length;
    }

    //return value by index
    public int getValue(int index){

        for (int i = 0; i < array.length; i++){
            if(index >= 0 && i < cursor){
                return array[index];
            }return  -1;
        }return index;
    }
    //return index by value
    public int getIndex(int value){

        int i = 0;

        while ( i < cursor){

            if (array[i] == value){
                return i;
            }
            i++;
        }
        return -1;
    }


    public int removeByIndex (int index){
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

            return Integer.MIN_VALUE;
        }
    }

    // Поиск по значению. Первое вхождение
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс первого найдено вхождения = 1
    public int getFirstIndex(int value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Метод поиска по значению. Поиск последнего вхождения
    // {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4
    public int getLastIndexOf(int value) {
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
        int index = getFirstIndex(value);
        if (index == -1) return false;

        removeByIndex(index);
        return true;
    }
    public void setNewValueToElement(int newValue, int index){

        for(int i =0; i < array.length;i++){
            if(i == index){
                array[i] = newValue;
            }
        }
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

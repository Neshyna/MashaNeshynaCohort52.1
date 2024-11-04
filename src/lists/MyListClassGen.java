package lists;

import java.lang.reflect.Array;
import java.util.Iterator;

public class MyListClassGen<T> implements MyList<T>, Iterable<T> {

    private T[] array;
    private int cursor;

    @Override
    public void add(T value){

        array[cursor] = value;
        cursor++;
    }

    @Override
    public void addAll(T[] values) {
        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    @Override
    public int size() {
        return cursor;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = cursor - 1; i >= 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(T value) {
        int index = indexOf(value);
        if (index == -1) return false;

        if (index >= 0 )
            return true;
        return indexOf(value) >= 0;
    }

    @Override
    public T[] toArray() {
        /*
        1. Создать новый массив размерностью cursor
        2. Пройтись по нашему Внутреннему массиву и скопировать все элементы в новый массив
        3. Вернуть ссылку на новый массив
         */


        // Взять какой-то объект из моего массива и узнать на стадии выполнение программы тип этого объекта.
        // И потом могу создать массив этого типа данных

        if (cursor == 0) return null;
        // if (cursor == 0) return (T[]) new Object[0]; // ошибка в RunTime

        Class<T> clazz = (Class<T>) array[0].getClass();
//        System.out.println("clazz = " + clazz);

        // Создаю массив того же типа, как и 0-й элемент
        T[] result = (T[]) Array.newInstance(clazz, cursor);

        for (int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }

        return result;


//          Этот код вызывает ошибку
//        T[] result = (T[]) new Object[cursor];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = array[i];
//        }



    }

    @Override
    public boolean remove(T value) {//Integer.valueOf()
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }

    @Override
    public T remove(int index) {
        if (index >= 0 && index < cursor) {
            T value = array[index];
            for (int i = index; i < cursor - 1; i++) {
                array[i] = array[i + 1];
            }
            cursor--;
            return value;
        } else {
            return null;
        }
    }
    @Override
    public boolean isEmpty () {
        if (cursor <= 0) {
            return true;
        }
        return false;
    }

    @Override
    public T get ( int index){
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }


    @Override
    public void set(int index, T value){
        //if(index >= 0 && index < cursor)
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(index)) {
                array[index] = value;

            }
        }
    }
    // Возвращает строковое представление массива
    // [1, 14, 16]
    public String toString() {

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }

        return result;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
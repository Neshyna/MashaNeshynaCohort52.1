package hw25;

public class MyListClassGen<T> implements MyList {

    T[] array = (T[]) new Object[4];
    int cursor;

    @Override
    public void add(Object value) {

        array[cursor] = (T) value;
        cursor++;
    }

    @Override
    public void addAll(Object[] values) {
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
    public boolean contains(Object value) {
        int index = indexOf(value);
        if (index == -1) return false;

        return true;
    }

    @Override
    public Object[] toArray() {
        if (cursor == 0) return new String[]{"[]"};

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + (i < cursor - 1 ? ", " : "]"); //", " / "]"
        }
        return new String[]{result};
    }

    @Override
    public boolean remove(Object value) {
        int index = indexOf(value);
        if (index == -1) return false;

        remove(index);
        return true;
    }

    @Override
    public Object remove(int index) {
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
    public Object get ( int index){
        if (index >= 0 && index < cursor) {
            return array[index];
        }
        return null;
    }


    @Override
    public void set(int index, Object value){
        for (int i = 0; i < cursor; i++) {
            if (array[i].equals(index)) {
                array[index] = (T) value;
            }
        }
    }


}
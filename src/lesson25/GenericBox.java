package lesson25;
//T type; E element; K key; V value
public class GenericBox<T> {

    private T value;
    public GenericBox(T value){
        this.value = value;
    }
    public T getValue(T value){
        return value;
    }
    public  void  setValue(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }
}

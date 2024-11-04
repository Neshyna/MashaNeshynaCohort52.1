package hw26;
/*
Task 1
Создайте обобщенный класс Pair, который хранит две переменные одного типа.

Требования:

Класс должен иметь конструктор, принимающий два параметра типа T.
Методы:
T getFirst() — возвращает первый элемент.
T getSecond() — возвращает второй элемент.
void setFirst(T value) — устанавливает значение первого элемента.
void setSecond(T value) — устанавливает значение второго элемента.
void swap() — меняет местами первый и второй элементы.
 */
public class Pair<T> {

    private T firstElement;
    private T secondElement;

    public Pair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }
    void swap(){
        T temp = firstElement;
        firstElement = secondElement;
        secondElement = temp;

    }

}

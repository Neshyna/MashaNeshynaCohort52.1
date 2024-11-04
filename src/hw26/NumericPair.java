package hw26;
/*
Task3 * Опционально
Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные
и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
 */

public class NumericPair<T extends Number, E extends Number> {

    private T x;
    private E y;

    public NumericPair(T x, E y) {
        this.x = x;
        this.y = y;
    }

    public double sum(){
        return x.doubleValue() + y.doubleValue();
    }

    public static void main(String[] args) {

        NumericPair<Integer, Double> intPair = new NumericPair<>(10, 2.0);
        System.out.println(intPair.sum());

        NumericPair<Double, Integer> doublePair = new NumericPair<>(5.5, 4);
        System.out.println(doublePair.sum());
    }
}

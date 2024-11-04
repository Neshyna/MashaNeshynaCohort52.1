package homework4_Neshyna_13September;

public class Task1 {
    //author: Masha Neshyna
    //date: 13/09/2024

    /*
    Task 1
Неявное преобразование int в double
Напишите программу, которая:

Объявляет переменную типа int и присваивает ей значение 10.
Присваивает значение этой переменной в переменную типа double с именем myDouble.
Выводит значение myDouble на экран.

Ожидаемый результат:Значение myDouble: 10.0
     */

    public static void main(String[] args) {

        int intValue = 10;
        double myDouble;
        myDouble = intValue;

        System.out.println("myDouble:" + myDouble);

    }
}

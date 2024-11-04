package hw19_Neshyna_Cohort52_1;
/*
Task 3
Неизменяемый объект
Создайте класс ImmutablePoint:

•	Объявите final поля x и y типа int.
•	Инициализируйте их через конструктор.
•	Попытайтесь создать методы-сеттеры для изменения значений x и y.
•	Объясните, почему значения полей не могут быть изменены после создания объекта.
 */
public class ImmutablePoint {

    public static void main(String[] args) {
        ImmutablePoint immutablePoint = new ImmutablePoint(3,5);//obj created
    //link of the "final" variable can not be changed, only the object can be changed
    }

    final int x;
    final int y;

    //constructor
    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setY(int y){
        //this.y = y;
        //for "final" variable the setter is not possible. error compilation
    }

    public void setX(int x){
        //this.x = x;
        //for "final" variable the setter is not possible. error compilation
    }


}

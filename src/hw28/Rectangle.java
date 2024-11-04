package hw28;


import lists.MyArrayList;
import lists.MyList;
import lists.MyListClassGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Task 1: Создание класса “Rectangle”
Создайте класс Rectangle, который представляет прямоугольник со следующими полями:

    - length (длина) — тип double
    - width (ширина) — тип double

Требования:
Конструкторы:
   - Создайте конструктор, который инициализирует оба поля класса.
   - Создайте конструктор без параметров (по умолчанию), который устанавливает длину
   и ширину в значение 1.0.

Методы:
   - Реализуйте методы доступа (геттеры и сеттеры) для каждого поля.
   - Переопределите метод toString(), чтобы он возвращал строковое представление
   объекта Rectangle в формате: "Прямоугольник [длина=..., ширина=...]".

Метод main():
   - В методе main() создайте несколько объектов Rectangle и выведите их на экран,
   используя метод toString().

   Task 2: Сравнение объектов класса “Rectangle”
Используя класс Rectangle из первого задания, необходимо реализовать сравнение
 объектов на равенство по их содержимому.

Требования:
Переопределение метода equals():
    - Переопределите метод equals() в классе Rectangle, чтобы два объекта считались
    равными, если у них совпадают значения полей length и width.

Метод main():
- Создайте несколько объектов Rectangle, некоторые из которых имеют одинаковые длину
и ширину.
- Сравните объекты между собой, используя метод equals(), и выведите результаты
сравнения на экран
 */
public class Rectangle {
    Double length = 1.0;
    Double width = 1.0;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        //empty constructor takes default values 1.0
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        //if (obj == null || getClass() != obj.getClass()) return false;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;

        return Objects.equals(width,rectangle.width)&&
                Objects.equals(length,rectangle.length);

    }

    public static void removeDuplicates(MyArrayList<Rectangle> rectangles,Rectangle rectangle) {
        /*
        Task 3. Опционально задание
Удаление дубликатов из списка объектов “Rectangle”
Создайте метод, который принимает список объектов Rectangle и объект Rectangle, и удаляет
 из списка все объекты, которые равны переданному объекту (по значению полей length и width).

Требования:
Метод удаления дубликатов:
- Реализуйте метод removeDuplicates, который принимает список List<Rectangle> и объект Rectangle.
- Метод должен удалить из списка все объекты, которые равны переданному объекту
(используя переопределённый метод equals()).
Метод main():
- Создайте список MyArrayList<Rectangle> и добавьте в него несколько объектов, включая дубликаты.
- Вызовите метод removeDuplicates, передав ему список и объект Rectangle,
дубликаты которого нужно удалить.
- Выведите на экран список до и после удаления дубликатов.

         */

        for (int i = rectangles.size() - 1; i >= 0; i--) {
            if (rectangles.get(i).equals(rectangle)) {
                rectangles.remove(i);
            }
        }

        /*
        one more option
        while(rectangle.contains(rectangleToRemove)){
        rectangle.remove(rectangleToRemove)
        }
         */
       /*
       leave only one duplicate and delete all the rest
        MyList<Rectangle>result = new MyArrayList<>();
        for (int i = 0; i < result.size();i++){
            if (result.contains(rectangle.get(i))){
                result.add(rectangle.get(i));
            }

        }
        return result;*/
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2.4,4.2);
        Rectangle rectangle2 = new Rectangle(3.5,6.7);

        Rectangle rectangle3 = new Rectangle();//empty - default

        //equal objects to compare
        Rectangle rectangle4 = new Rectangle(3.3,3.3);
        Rectangle rectangle5 = new Rectangle(3.3,3.3);
        Rectangle rectangle6 = new Rectangle();
        Rectangle rectangle7 = new Rectangle(1.0,1.0);

        System.out.println(rectangle1.toString());
        System.out.println(rectangle2.toString());
        System.out.println(rectangle3.toString());//default values//empty constructor//1.0

        System.out.println("rectangle 4 = rectangle 5 " + rectangle4.equals(rectangle5));
        System.out.println("rectangle 6 = rectangle 7 " + rectangle6.equals(rectangle7));
        System.out.println("rectangle 5 = rectangle 1 " + rectangle5.equals(rectangle1));


        System.out.println("========task 3=========");

        MyArrayList<Rectangle> rectangles = new MyArrayList<>();

        rectangles.add(new Rectangle(4.0, 2.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат
        rectangles.add(new Rectangle(6.0, 4.0));
        rectangles.add(new Rectangle(5.0, 3.0)); // Дубликат

        System.out.println(rectangles.toString());//before delete
        Rectangle rectangleToRemove = new Rectangle(5.0, 3.0);
        removeDuplicates(rectangles, rectangleToRemove);
        System.out.println(rectangles.toString());//after delete



    }
}

package hw22.task3;
/*
Task 3 опционально
Фигуры и их площади

Создайте класс Фигура с методом рассчитатьПлощадь().

Реализуйте классы различных геометрических фигур (например, Круг, Квадрат, Треугольник).

В главном классе создайте список фигур и вычислите площадь каждой из них.
 */
public class Shape {

    private double square;

    private String name;

    public void listShapes() {

        Shape circle = new Circle(3.4);
        Shape rectangle = new Rectangle(2.5, 3.4);
        Shape triangle = new Triangle(8.7, 4.2);

        Shape[] shapes = new Shape[3];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = triangle;

        for (int i = 0; i < shapes.length;i++){

            double square = shapes[i].square();
            System.out.println(shapes[i].getName() + square);
        }
    }

    public Shape() {
        this.square = square();

    }

    public double square(){

        return square;
    }

    public String getName() {
        return name;
    }
}

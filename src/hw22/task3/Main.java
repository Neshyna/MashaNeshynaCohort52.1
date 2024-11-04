package hw22.task3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(6);
        System.out.println(circle.getName() + circle.square());

        Rectangle rectangle = new Rectangle(22,45);
        System.out.println(rectangle.getName() + rectangle.square());

        Triangle triangle = new Triangle(23,56);
        System.out.println(triangle.getName() + triangle.square());

        System.out.println("=======Print list of shape (array)========");
        Shape shape = new Shape();
        shape.listShapes();






    }
}

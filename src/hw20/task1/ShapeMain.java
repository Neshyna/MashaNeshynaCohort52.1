package hw20.task1;

public class ShapeMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("rectangle");
        System.out.println(rectangle.displayInfo("rectangle","red"));
        System.out.println("calculate area rectangle: " + rectangle.calculateArea(3.0,3.0));

        Circle circle = new Circle("circle");
        System.out.println(circle.displayInfo("circle","blue"));
        System.out.println("calculate circle square: " + circle.calculateCircleArea(3.0));


    }
}

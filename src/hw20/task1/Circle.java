package hw20.task1;

public class Circle extends Shape {

    private double radius;
    private static final double PI = 3.141519;

    public Circle(String name) {
        super(name);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;

    }
    public double calculateCircleArea(double radius){
        double square = PI * radius * radius;
        return square;
    }
}

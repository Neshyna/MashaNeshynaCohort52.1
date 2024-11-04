package hw22.task3;

public class Circle extends Shape{

    private double radius;
    private static final double PI = 3.141519;

    private String name = "circle ";

    public String getName() {
        return name;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        return  PI * radius * radius;

    }
}

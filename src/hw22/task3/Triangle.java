package hw22.task3;

public class Triangle extends Shape{

    private double height;
    private double sideLength;

    private String name = "triangle ";

    public String getName() {
        return name;
    }

    public Triangle(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double square() {
        return sideLength * height /2;
    }
}

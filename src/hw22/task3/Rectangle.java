package hw22.task3;

public class Rectangle extends Shape{

    private double width;
    private double height;

    private String name = "rectangle ";

    public String getName() {
        return name;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }
}

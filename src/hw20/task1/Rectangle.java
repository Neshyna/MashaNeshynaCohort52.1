package hw20.task1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);
        double width;
        double height;

    }
    public void setDimentions(double width, double height){
        this.width = width;
        this.height = height;

    }
    public double calculateArea(double width, double height){
        double square = width * height;
        return square;
    }

}

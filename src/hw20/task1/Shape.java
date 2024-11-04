package hw20.task1;

public class Shape {
    private String name;
    private String color;

    public Shape(String name) {
        this.name = name;
    }

    public String displayInfo(String name, String color){
        return "shape name is: " + name + " and color: " + color;

    }
    public void setColor(String color){
        this.color = color;

    }

}

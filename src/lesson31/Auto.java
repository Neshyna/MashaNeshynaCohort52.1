package lesson31;

public class Auto {
    public static final String RED = "RED";

    private String model;
    //private String color;
    private Color color;

    public Auto(String model, Color color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

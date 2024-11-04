package lesson31;

public class AutoApp {
    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);

        Auto auto = new Auto("Model1", Color.BLUE);
        System.out.println(auto);

        auto.setColor(color);
        System.out.println(auto);

        System.out.println("==============");
        Color[] colors = Color.values();//return all values array

        for (Color currentColor : colors){
            System.out.println(currentColor);
        }

        //returns enum by string name
        Color color1 = Color.valueOf("RED");
        System.out.println(color1);

        //return constanta name
        String name = Color.RED.name();
        System.out.println(name + "!");

        //return order number (begins from 0)
        int ordinal = Color.GREEN.ordinal();
        System.out.println("ordinal: " + ordinal);

        //compare with ==
        if (auto.getColor() == Color.GREEN){
            System.out.println("auto color green");
        }else {
            System.out.println("not green");
        }

        System.out.println("=======switch=======");
        //used often with switch
        switch (color){
            case RED:
                System.out.println("red");
                break;
            case GREEN:
                System.out.println("green");
                break;
            default:
                System.out.println("another color");
        }
    }
}

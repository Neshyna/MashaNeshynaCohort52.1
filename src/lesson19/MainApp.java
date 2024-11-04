package lesson19;

import lesson18.Car;

public class MainApp {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(50);
        FinalDemo finalDemo1 = new FinalDemo();

        Car car = new Car("BMW",200);
        //we can't rewrite link, when variable is final,
        // but object condition can be changed
        // car = new Car("VW", 350);
        // car = null;


        car.setPowerPS(800);
        System.out.println(car.toString());


        System.out.println(FinalDemo.PI);
        //FinalDemo.PI = 10.0;//not possible

        System.out.println(finalDemo.COUNTRY.toUpperCase());
        System.out.println("Country: " + FinalDemo.COUNTRY);

        System.out.println("getPI: " + finalDemo.getPi());
    }
}

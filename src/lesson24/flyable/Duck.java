package lesson24.flyable;

public class Duck implements FLyable, Swimmable{

    @Override
    public void fly() {
        System.out.println("duck fly");
    }

    @Override
    public void swim() {
        System.out.println("duck swimming");
    }
}

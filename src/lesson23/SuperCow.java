package lesson23;

public class SuperCow extends Cow{

    public SuperCow(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("SuperCow move");
    }

    @Override
    public void sayHello() {
        System.out.println("SuperCow sayHello");
    }
}

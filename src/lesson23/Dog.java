package lesson23;

public class Dog extends  Animal{

    @Override
    void eat() {
        System.out.println(" dog eat");

    }

    @Override
    public void sayHello(){
        System.out.println("dog " + name + " says bark");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println(name + " dog runs");
    }
}

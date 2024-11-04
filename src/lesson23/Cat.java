package lesson23;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("cat " + name + " eat ");
    }

    @Override
    void move() {
        System.out.println("cat moves");
    }
}

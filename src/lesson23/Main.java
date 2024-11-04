package lesson23;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("murka");
        cat.eat();

        //Animal animal = new Cat();
        // error compilation. no abstract example of abstract class
        //only possible to collect child into links of parent class

        Dog dog = new Dog("tuzik");
        dog.eat();
        dog.sayHello();

        animalTest(cat);

        SuperCow superCow = new SuperCow("Mu!");

        animalTest(superCow);

    }
    public static void animalTest(Animal animal){
        animal.sayHello();
        animal.eat();
    }
}

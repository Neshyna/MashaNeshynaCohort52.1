package lesson23;

//when child not override all abstract methods of parent class
//it must be masked as abstract class too
abstract class Cow extends  Animal{

    public Cow(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(" cow eats");
    }
}

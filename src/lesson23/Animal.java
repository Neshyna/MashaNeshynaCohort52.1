package lesson23;

abstract class Animal {//when there is abstract method class must be abstract too

    protected String name;//abstract class can have constants and fields with constructor

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();//no method body
    //description only in child class

    //common method can be at abstract class
    public void  sayHello(){
        System.out.println("hello from animals");
    }

    abstract void move();

}

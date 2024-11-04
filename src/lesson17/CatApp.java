package lesson17;

public class CatApp {
    public static void main(String[] args) {
        Cat17 cat = new Cat17("Catty", 8, 5);

        cat.sayMeuw();

        System.out.println(cat.toString());

        //cat.age = -1000;
        cat.weight = 1500;
        //cat.name = null;

        System.out.println(cat.toString());

        String name = cat.getName();
        System.out.println("name: " + name);

        System.out.println("age: " + cat.getAge());

        cat.setAge(25);//will not set, do not comply with conditions
        System.out.println(cat.toString());


    }
}

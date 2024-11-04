package lesson16;

import lesson15.Cat;

public class Lesson16 {
    public static void main(String[] args) {

        Cat catVar = new Cat();
        /*
        new object type Cat
        call constructor to initialize object fields
         */

        catVar.whoAmI();

        System.out.println(catVar.name);

        catVar.name = "Jack";

        System.out.println(catVar.name);

        System.out.println("======================");

        Cat barsik = new Cat("Barsik", "grey", 3);
        barsik.whoAmI();
        System.out.println("name: " + barsik.name);

        barsik.age = 12;
        System.out.println("age: " + barsik.age);

        System.out.println("============");
        Cat cat1 = new Cat("barsik", "grey", 3);
        cat1.whoAmI();

        Cat catClone = cat1;
        catClone.whoAmI();

        cat1.age = 100;
        cat1.whoAmI();
        catClone.whoAmI();

        catClone.name = "Max";
        cat1.whoAmI();

        catClone = new Cat("kratos", "black", 99);
        catClone.whoAmI();
        cat1.whoAmI();

        catClone = null;
        //catClone.whoAmI();//null point exception// no link to the object
        if (catClone != null){
            System.out.println(catClone.name);
            catClone.whoAmI();
        }
    }
}

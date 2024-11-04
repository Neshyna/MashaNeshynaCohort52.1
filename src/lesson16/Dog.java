package lesson16;

public class Dog {
    String name;
    int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight =  weight;
    }
    String info(){
        return "I an a dog " + name +  ", my weight is: " + weight;
    }

    void eat (){
        System.out.println("I eat");
        weight++;
    }

    void run (){
        /*
        is the weight  enough for run
        if weight is no small, dog need to eat before run
         */

        while(weight <= 5){
            System.out.println("sorry! I'm hungry. I can't run.");
            System.out.println("need to eat. my weight is : " + weight);

            eat();
        }

        System.out.println("I run");
        weight -= 2;//weight = weight -2
        System.out.println("weight after run: " + weight);
        System.out.println("====================");

    }
}

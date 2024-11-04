package lesson17;

public class Cat17 {
    String name;
    protected int age;//not available in another package
    int weight;

    public Cat17 (String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    private  Cat17(){//not available in another class

    }
    void  sayMeuw(){
        System.out.println("Meuw" + name);
    }
    public String toString(){
        return "Cat" + name + ", age: " + age + ", weight: " + weight;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }


    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 20) {
            // прекращение работы метода, если входящий возраст нас "не устраивает"
            return;
        }
        this.age = age;
    }
}

package lesson18;

public class Car {

    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS){
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++;
        //увелич общ кол во авто при создании нов объекта

    }

    public String toString(){
        // Нельзя создать статическую переменную внутри какого-то метода
        //   static String result = "Hello";
        return String.format("Auto - model: %s, power: %d. Total number: %d" , model, powerPS, totalCarProduced);
    }

    public static void testStatic() {
        // В статике нельзя использовать this - обращение к текущему объекту
        // this.model
        System.out.println("Hello from static method");
    }

    public int getPowerPS() {
        return powerPS;
    }

    public void setPowerPS(int powerPS) {
        this.powerPS = powerPS;
    }
    public void test(final int number){
        //final at method parameters, not possible to change
        //because the variable is final
        int x = number + 10;
        x++;
    }
    public void  test (final  int[] numbers){
        //no new link possible
        //numbers = new int[100];

        //can be used
        int[] newNumbers = numbers;

        //can change condition of the object
        numbers[0] = 10000;
    }
}

package lesson19;

public class FinalDemo {

   public static final double PI = 3.141519;//constanta
    //constanta names are written with upper case

    public static final int[] ints = new int[10];
    //not a constanta, because it's possible to change




    // Переменная примитивного типа, помеченная ключевом словом final
    private final int x;
// Final переменные должны быть явно проинициализированы.
    // Прямо в поле, в конструкторе или в блоке инициализации.

    private final int[] array = new int[10];
    // Ссылочные типы данных. Невозможно переписать ссылку, которая хранится в переменной

    public static final String COUNTRY = "Germany";//constanta

    public static final String[] colors = {"blue", "red", "yellow"};



    public FinalDemo(){

        //colors = new String[10];//not possible
        colors[0] = "green";// add smth

        ints[0] = 1;

        this.x = 100;
        // Нельзя присвоить ссылку на другой объект
        // this.array = new int[20];
        // Но мы можем изменять состояние самого объекта
        this.array[0] = 1000;
        this.array[array.length - 1] = 1500;
    }

    public FinalDemo(int x){
        this.x = x;// после инициализации переменной нельзя поменять значение переменной.
        //  this.x = 10; не могу изменить значение final переменной



    }
    public void changeX(){
       // x = 15;// compilation error, x final is a variable
    }
    public  int getX(){
        return  x;
    }
    public  void setX(int x){
        //this.x = x; for final variable the setter is not possible. error compilation
    }

    public double getPi(){
        return PI * this.x;
    }

}

package lesson9;

public class MethodExample {
    public static void main(String[] args) {

        sayHello();

        String string = "Java1";
        System.out.println(string);

        saySomething("Java2");

        char ch = 'A';
        char anotherChar = 'B';

        printDecimalCodeChar(ch);
        printDecimalCodeChar(anotherChar);

        System.out.println("==============print array=============");
        int[] array = {1,2,3,4,56,6,7,8};

        printArray(array);
        int[] array2 = {56,234,1234,5678,65};
        printArray(array2);

        array[0] = 2345;
        printArray(array);

        //перегрузка методов
        /*
        в пределах одного класса может быть
        2 или больше методов с одинаков названиями
        но разным набором параметров

        сигнатура метода -
        совокупность названия и набора параметров
        и даже порядок передачи параметров

         */

        //method to print numbers from 1 to 10
        System.out.println("============print numbers============");
        printNumbers(10);

        //method to print x y
        printNumber(5,10);
        printNumber("Java", 1);
        printNumber(5, "Python");

    }// method area

    //three different methods
    public static void printNumber(int x, String str){
        System.out.println("Method optional 1:" + str);
        }
    //three different methods
    public static void printNumber(String str , int x){
        System.out.println("Method optional 2:" + str);
    }
    //three different methods
    public static void printNumber(int x, int y){
        int i =x;
        while(i<=y){
            System.out.println(i++ + ", ");
        }
    }
    //three different methods
    public static void printNumbers(int n){
        int i =1;
        while(i<=n){
            System.out.println(i++ + ", ");
        }
    }

    public static void printArray(int[] array){
        System.out.print("[");
        int i = 0;
        while (i < array.length){
            System.out.print((array[i] + ((i < array.length -1) ? "," : "]\n")));
            i++;
        }
    }

    public static void printDecimalCodeChar (char ch1){
        System.out.println((int) ch1);
    }

    public static void  saySomething(String text) {
        System.out.println(text);
    }

    public static void sayHello() {
        // method body
        System.out.println("Hello!");
    }

}//end class

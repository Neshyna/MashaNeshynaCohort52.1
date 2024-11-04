package lesson10;

import java.util.Random;

public class MethodWithReturn {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        int sum = sum(a,b);

        sum = sum(10,20);
        System.out.println(sum);

        System.out.println(sqNumber(2.5));
        double var = sqNumber(4.0);
        System.out.println(var + "<- var");

        String concat = concatString("Java", 17);
        System.out.println(concat);

        // Метод создает массив интов на 10 элементов.
        // Заполняет случайным значениями
        int[] ints = fillArray();

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + ", ");
        }
        System.out.println();

    }
    public static double sqNumber(double number){
        return number+number;
    }

    public static int[] fillArray() {
        int[] result = new int[10];

        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(101);
        }

        return result;
    }

    public static String concatString(String str, int x) {
        String result = str + x + "!!!";
        return result;
    }

    public static int sum(int x,int y){
        int result = x + y;
        System.out.println(result);
        return result;
    }
}

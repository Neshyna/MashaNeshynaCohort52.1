package lesson8;

import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {
        int [] arrays; // объявление массива целых чисел
        String [] strings; // объявление массива строк

        //int [] array1[];// альтернативный способ нерекоменд

        arrays = new int[4];// массив типа int с 4мя ячейками
        strings = new String[10];

        int [] arrays2 = new int[8];// new massive data with int with 8 places
        boolean[] booleans = new boolean[3];//false
        /*
        Значения по умолчанию.
        1.для всех числовых типов (в том числе char) это будет 0(0.0)
        2.для boolean - false
        3.для всех ссылочных типов данных -null

         */

        int value = arrays[0]; //получить из массива значение, находящ в ячейке с индексом 0
        System.out.println("value:" + value);
        System.out.println("array2[3]:" + arrays2[3]);
        System.out.println("strings[9]:" + strings[9]);
        System.out.println("booleans[1]:" + booleans[1]);

        //print all values in massive impossible this way
        System.out.println("arrays:" + arrays);//получим ссылку на адрес в ячейке памяти в Heap

        //явная инициализация массива
        int[] numbers = new int[] {45,56,-16,0, 159};
        int[] ints = {-10,54,32333,444};

        int val = numbers[0];
        System.out.println("val"+val);
        System.out.println("numbers[4]"+ numbers[4]);

        numbers[2] = 100;// присвоение нового значения в ячейку с индексом 2


        System.out.println("print all massive's values");
        int j = 0;
        while (j < numbers.length) {
            System.out.print(numbers[j++] + ";");
        }
        System.out.println();


        //create massive with 10 elements and fll it with  random numerals 0..100
        Random random = new Random();

        int[] nums = new int[10];
        int k = 0;

        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.println(nums[k] + " , ");
            k++;
        }
        System.out.println("]");



        // найти минимальное значение в массиве
        int min = nums[0];
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < min) {
                min = nums[i];
            }
            i++;
        }

        System.out.println("Минимальное значение в массиве: " + min);




    }
}

package lesson19;

import java.util.Arrays;
import java.util.Random;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3,2,1,0};

        //return string array
        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("============sort array================");
        Arrays.sort(array);
        //Arrays.sort(array,1,3);//sort from x index till y index including
        System.out.println(Arrays.toString(array));

        System.out.println("=======binary search=========");
        int index = Arrays.binarySearch(array,10);
        //when found return >=0, when not -> minus number i.e. -5
        System.out.println("index: " + index);

        System.out.println("=======compare equality============");
        int[] test = {0,2,1,3};
        System.out.println("array equals(test): " + array.equals(test));
        //not correct to compare by value
        boolean isArrayEquals = Arrays.equals(array,test);
        //this method better compare arrays
        System.out.println("array equals array test: " + isArrayEquals);

        //find 1st index of mismatch
        int mismatchIndex = Arrays.mismatch(array,test);
        System.out.println("arrays mismatch: " + mismatchIndex);

        System.out.println("=====многомерные массивы====");
        int[][] array0 = new int [3][4];
        System.out.println(Arrays.deepToString(array0));
        //returns string representation of the array including folded arrays

        //compare многомерные массивы
        int[][] array1 = new int[3][4];
        boolean isEquals = Arrays.deepEquals(array0,array1);
        System.out.println("deep equals arrya 0 and array 0: " + isEquals);
        array0[0][3] = 1;
        array0[2][2] = 5;
        System.out.println(Arrays.deepToString(array0));

        System.out.println("=========copy of==========");
        //creates new array  with defined length and copy elements of the old array
        //when new array length is longer, free elements are filled with 0 or null

        System.out.println("test array: " + Arrays.toString(test));
        int[] copyOfTest = Arrays.copyOf(test,10);
        System.out.println(Arrays.toString(copyOfTest));
        copyOfTest = Arrays.copyOf(test,2);
        System.out.println(Arrays.toString(copyOfTest));


        System.out.println("\n =========== copyOfRange =============");
        /*
        copyOfRange - Создает новый массив и записывает в него значение от индекса from до индекса to. Последний индекс не включается
         */
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] rangeFromInts = Arrays.copyOfRange(ints, 3, 10);
        System.out.println("Arrays.copyOfRange(ints, 3, 10): " + Arrays.toString(rangeFromInts));
        // Получить новый массив со значениями "старого массива" (копирование объекта)
        int[] copyOfInts = Arrays.copyOf(ints, ints.length);
        System.out.println("Arrays.copyOf(ints, ints.length): " + Arrays.toString(copyOfInts));
        copyOfTest = Arrays.copyOfRange(ints, 0, ints.length);
        System.out.println("Arrays.copyOfRange(ints, 0, ints.length): " + Arrays.toString(copyOfTest));

        System.out.println("\n =========== System.arraycopy =============");
        /*
        System.arraycopy - принимает 5 параметров
        Массив-донор (откуда мы берем значения)
        Индекс с которого мы берем значения
        Массив в который будут вставлены значения
        Индекс с которого начнут записываться значения
        Количество копируемых значений
         */

        int[] target = new int[10];
        System.arraycopy(ints, 9, target, 3, 5);
        System.out.println(Arrays.toString(target));

        System.out.println("\n =========== fill =============");

        // Заполнение массива указанным значением
        int[] arr = new int[5];
        Arrays.fill(arr, 10);
        Arrays.fill(arr, 2, 4, 1000);
        Random random = new Random();
        Arrays.fill(arr, random.nextInt(101));
        System.out.println(Arrays.toString(arr));







    }
}

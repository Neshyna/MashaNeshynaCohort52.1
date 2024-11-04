package hw9_Neshyna_cohort52_1_20Sept;

import java.util.Random;

/*
Task 3 * (Опционально)
Заполните массив 50 случайными числами от 1 до 100.
Программа должна найти, и вывести на экран все простые числа.
Посчитайте сколько получилось таких чисел в массиве.
Простое число - число, которое делится на цело только на 1 и само себя.

Пример простых чисел: 3, 5, 7, 11, 13 и т.д.
 */
public class Task3 {
    public static void main(String[] args) {

        int[] digits = new int[50];
        fillArray(digits);
        printArray(digits);
        printArray(primeArray(digits));


    }

    public static void fillArray(int[] digits) {

        Random random = new Random();

        for (int i = 0; i < digits.length; i++) {
            digits[i] = random.nextInt(101);
        }

    }
    public static void printArray(int[] array){

        System.out.print("[");
        int i = 0;
        while (i < array.length){
            System.out.print(array[i] + ((i < array.length -1) ? "," : "]\n"));
            i++;
        }

    }

    public static boolean isPrimeNumber (int x) {


        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }

        }
        return true;
    }
    public static int[] primeArray (int [] array) {

        int  count = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (isPrimeNumber(array[i])) {
                count++;
            }
        }

        if (count == 0) return new int[0];

        int[] array2 = new int[array.length];//new array created

        for (int i = 0; i < array.length && j < count; i++) {
            if (isPrimeNumber(array[i])) {
                array2[j++] = array[i];
            }
        }


        System.out.println("Quantity of Prime Numbers in the new Array: " + count);

        return array2;

    }
}

package hw10_Neshyna_cohort52_1_20Sep;

import java.util.Arrays;

public class T4_HW10_Neshyna_C52_1 {
    /*
    Task 4* со звездочкой (Опционально)
Дано: Два отсортированных массива целых чисел. Вам нужно найти элемент,
 который будет находиться на k-й позиции в объединенном отсортированном массиве.

Массив 1 - {100, 112, 256, 349, 770}
Массив 2 - {72, 86, 113, 119, 265, 445, 892}
k = 7

Вывод : 256

Можно такой вывод:

72, 86, 100, 112, 113, 119, 256
Искомое число: 256

Объединенный отсортированный массив был бы такой (выводить, формировать его не обязательно) -

[72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]

7-й элемент (по счету) этого массива хранит значение 256.
     */
    public static void main(String[] args) {

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;// k number location

        int[] arrayJoin = joinArray(array1,array2);
        int kElement = kElement(arrayJoin,7);

    }
    public static int[] joinArray (int[] array1, int[] array2){

        int[] arrayJoin = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++) {
            arrayJoin[i] = array1[i];
        }

        // Copy elements of the second array
        for (int i = 0; i < array2.length; i++) {
            arrayJoin[array1.length + i] = array2[i];
        }

        for (int i = 0; i < arrayJoin.length; i++){
            System.out.println(arrayJoin[i]);//just printed array not formated

        }
        System.out.println(Arrays.toString(arrayJoin)); //formated array but not ascending order
        Arrays.sort(arrayJoin);
        System.out.println("sorted joined array: " + Arrays.toString(arrayJoin));//formated and ascending
        return arrayJoin;
    }


    public static int kElement (int[] arrayJoin, int k){

        System.out.println("k element: " + arrayJoin[k]);

        return arrayJoin[k];
    }
}
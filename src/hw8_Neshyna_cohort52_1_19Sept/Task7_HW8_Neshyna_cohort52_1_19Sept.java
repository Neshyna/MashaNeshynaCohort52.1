package hw8_Neshyna_cohort52_1_19Sept;

public class Task7_HW8_Neshyna_cohort52_1_19Sept {
    /*
    Task 7
Дан массив целых чисел.
Поменять местами элементы с максимальным и минимальным значениями.

Пример:

{ 5, 6, -25, 0, 31, -15 } -> { 5, 6, 31, 0, -25, -15 }
     */

    public static void main(String[] args) {
       int [] arrays =  {5, 6, -25, 0, 31, -15 };


        //найти номера ячеек в мин и макс значениями
        int minIndex = 0;
        int min = arrays[minIndex];

        int maxIndex = 0;
        int max = arrays[maxIndex];

        //min value
        int i = 0;//счетчик
        while (i < arrays.length) {

            if (arrays[i] < min) {
                min = arrays[i];
                minIndex = i;
            }

            if (arrays[i] > max) {
                max = arrays[i];
                maxIndex = i;
            }
            i ++;
        }

        System.out.println("Min value: " + min);
        System.out.println("Min index: " + minIndex);
        System.out.println("Max value: " + max);
        System.out.println("Max index: " + maxIndex);

        //swap
        arrays[minIndex] = max;
        arrays[maxIndex] = min;


        int temp = arrays[minIndex];
        arrays[minIndex] = arrays[maxIndex];
        arrays[minIndex] = temp;


       int a = 0;
       while (a < arrays.length) {
            System.out.print(arrays[a++] + ";");
        }


    }
}

package hw8_Neshyna_cohort52_1_19Sept;

import java.util.Arrays;
import java.util.Random;

public class Task6_HW8_Neshyna_cohort52_1_19Sept {
    /*
    Task 6
Создать массив целых чисел произвольной длины от 5 до 15.
Заполнить массив случайными значениями от -50 до 50.

Вывести на экран:

Минимальное значение в массиве
Максимальное значение в массиве
Среднее арифметическое всех значений в массиве
     */
    public static void main(String[] args) {

        Random random = new Random();

        //create arrays with 15 elements and fill it with random numbers -50 ... 50
        int masLen = 5 + random.nextInt(11); //[5...15] рандомно выбирает колл ячеек
        int[] arrays = new int[masLen];
        int numerals = 0;

        System.out.print("print all :" );
        while (numerals < arrays.length) {
            arrays[numerals] = random.nextInt(100) - 50;
            System.out.print(arrays[numerals]);

            if (numerals < arrays.length -1){
                System.out.print(", ");
                //что бы после последнего элемента не печаталась еще одна запятая
            }
            else {
                System.out.println(".");
            }
            numerals++;
        }

        System.out.println();
        System.out.println("number of elemets:" + numerals);


        //min value
        int min = arrays[0];
        int variable = 0;

        while (variable < arrays.length) {
            if (arrays[variable] < min) {
                min = arrays[variable];
            }
            variable++;
        }
            System.out.println("Min value: " + min);



        //max value
        int max = arrays[0];
        int variable1 = 0;

        while (variable1 < arrays.length) {
            if (arrays[variable1] > max) {
                max = arrays[variable1];
            }
            variable1++;
        }
        System.out.println("Max value: " + max);


        //sumDivide15

        int sum = Arrays.stream(arrays).sum();
        System.out.println("sum:" + sum);
        int Average = sum/ masLen;
        System.out.println("Average:" + Average);
        }


        //alternative variant  (short variant)
        /*int min2 = arrays[0];
        int max2 = arrays[0];
        int sum2 = 0;

        int i = 0;
        while (i < arrays.length) {
            sum2 += arrays[i];
            if (arrays[i] < min2) min2 = arrays[1];
            if (arrays[i] > max2) max2 = arrays[1];
            i++;
    }
         System.out.println("Max value: " + max2);
         System.out.println("Min value: " + min2);
         System.out.println("Average:" + sum/ (double) masLen );

         */


    }


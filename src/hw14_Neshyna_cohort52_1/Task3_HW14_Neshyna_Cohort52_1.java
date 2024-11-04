package hw14_Neshyna_cohort52_1;

import java.util.Arrays;

public class Task3_HW14_Neshyna_Cohort52_1 {
    /*
    Task 3 * (Опционально)
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
     */
    public static void main(String[] args) {

        int[] array = {12, 62, 93, -54, 8755, 60, 723, 8, 94, 10};

        System.out.println("SecondMaxNumber: " + secondBigNumber(array));

        secondLargeNumber(array);

        }
    public static int secondBigNumber (int[] array){

        int secondMaxNumber = 0;
        int maxNumber = 0;


        for (int j = 0; j < array.length; j++){
            if(array[j] > maxNumber){
                maxNumber = array[j];
            }
        }
        System.out.println("max number:" + maxNumber);

        for (int i = 0; i < array.length; i++){
            if(array[i] != maxNumber){
                if (array[i] > secondMaxNumber){
                    secondMaxNumber = array[i];
                }
            }
        }
        return secondMaxNumber;


    }
    public static void secondLargeNumber (int[] array){

        Arrays.sort(array);
        System.out.println("second large number by sorting method: " + array[array.length -2]);
        //using "Array.sort" approach with ascending order found second value from the end

        }
    }


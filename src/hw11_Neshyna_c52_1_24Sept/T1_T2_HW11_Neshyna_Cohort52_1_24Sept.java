package hw11_Neshyna_c52_1_24Sept;

/*
Task 1
Написать метод, который считает сумму всех элементов в массиве.

Task 2
Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
 */

public class T1_T2_HW11_Neshyna_Cohort52_1_24Sept {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};

        System.out.println(sumAllArrayElements(array));
        System.out.println(avarageArray(array));

        int[] array2 = null;
        System.out.println(sumAllArrayElements(array2));

        System.out.println(avarageArray(array2));

        int[] emptyArray = new int[0];
        System.out.println(avarageArray( emptyArray));// infinity
        System.out.println(sumAllArrayElements(emptyArray));

    }

    public static int sumAllArrayElements (int[] array){

        if (array == null|| array.length ==0){
            System.out.println("Incorrect array data.");
            return Integer.MIN_VALUE;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        return sum;
    }


    public static double avarageArray (int[] array){

        if (array == null){
            return Integer.MIN_VALUE;
        }

        double average = (double)sumAllArrayElements(array)/array.length;

        return (double)average;

    }

}

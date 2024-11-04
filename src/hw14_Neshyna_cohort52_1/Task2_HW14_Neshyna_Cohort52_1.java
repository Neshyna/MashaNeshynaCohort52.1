package hw14_Neshyna_cohort52_1;

public class Task2_HW14_Neshyna_Cohort52_1 {
    /*
    Task 2
Сумма четных чисел
Напишите метод, который вычисляет сумму всех четных чисел в массиве.
     */
    public static void main(String[] args) {

        int[] array = {12, 62, 93, -54, 8755, 60, 723, 8, 94, 10};
        System.out.println("Sum of even numbers: " + sumEven(array));

    }

    public static int sumEven(int[] array) {

        int sumEven = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                System.out.println("Even number: " + array[i]);
                sumEven += array[i];
            }
        }
        return sumEven;
    }
}

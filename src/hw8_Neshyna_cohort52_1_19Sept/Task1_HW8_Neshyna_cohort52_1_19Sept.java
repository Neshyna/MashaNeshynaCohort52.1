package hw8_Neshyna_cohort52_1_19Sept;

public class Task1_HW8_Neshyna_cohort52_1_19Sept {
    /*
    Task 1
Найдите произведение всех чисел от 1 до 15 включительно.

Результат выведите на экран
     */
    public static void main(String[] args) {

        int number = 1;
        long multiply = 1;
        while (number <= 15) {
            multiply *= number;
            number++;
        }
        System.out.println("произведение всех чисел от 1 до 15: " + multiply );
    }
}

package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Random;

/*
Task 2
Запишите в 4 переменные случайные числа от 0 до 100.
Выведите все 4 числа на экран.
Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
Output:
Максимальное число: 33
 */
public class Task2_HW7_Neshyna_cohort52_1_18Sept {
    public static void main(String[] args) {

        Random random = new Random();

        int a1 = random.nextInt(101);
        int a2 = random.nextInt(101);
        int a3 = random.nextInt(101);
        int a4 = random.nextInt(101);

        System.out.println(a1 + " , " + a2 + " , " + a3 + " , " + a4 );
        System.out.printf("%d | %d | %d | %d\n", a1, a2, a3, a4);//format print F


        int max = a1;

        if (a2 > max) max = a2;

        if (a3 > max) max = a3;

        if (a4 > max) max = a4;


        System.out.println("max number:" + max);
    }
}

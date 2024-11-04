package hw9_Neshyna_cohort52_1_20Sept;

import java.util.Scanner;

public class Task2_HW9_Neshyna_cohort52_1_20Sept {
    /*
    Task 2
Написать метод, принимающий на вход целое число. Метод должен вывести на экран 2 в степени этоЧисло

Например: Если в метод пришло число 3 - метод должен вывести число 8 (так как 2 в степени 3 = 8)

класс Math для нахождения степени числа использовать нельзя ;)
     */
    public static void main(String[] args) {

        powerOfNumberMethod(-5);

    }//method body

    public static void powerOfNumberMethod(int power){//степень

        int number = 2;//вводимое в степень число
        int result = 1;//число в степени

        boolean isPositive = power >= 0;

        power = (isPositive) ? power : power * -1;
        //in case of negative power
        //2^ (-2) = 1/(2^2) = 1/4 = 0.25 if negative power

        int i = 0;

        while (i < power ){
            result = result * number;
            i ++;
        }
        if (isPositive) {
            System.out.println("2 powered " + power + " is " + result);
        }else{
        System.out.println("2 powered " + power + " is " + 1/(double)result);
        // when negative power


            //System.out.printf("2 ^ %d = %d\n", pow, result);
            // formating variant
            }
    }
}//end class

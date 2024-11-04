package hw8_Neshyna_cohort52_1_19Sept;

import java.util.Scanner;

/*
Task 5 * (Опционально)
Программа запрашивает у пользователя ввод произвольного числа.
 Вывести сумму цифр этого числа.

Пример:

567432 -> 5+6+7+4+3+2 -> 27
 */
public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert random number");
        int input = scanner.nextInt();
        System.out.println("Scanned number: " + input);

        int sum = 0;

        while(input >= 1 ){

            int x = input % 10;
            input = input / 10;
            sum += x;

        }System.out.println(sum);

    }
}

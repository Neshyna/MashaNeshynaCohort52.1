package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Scanner;

public class Task4_HW7_Neshyna_cohort52_1_18Sept {
    /*
    Task 4
Напишите программу с использованием оператора switch:

Программа просит пользователя ввести число от 1 до 7.
Если число равно 1, выводим на консоль "Понедельник",
2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" type any number from 1 to 7:");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6: case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("given number is incorrect");

        }
    }
}

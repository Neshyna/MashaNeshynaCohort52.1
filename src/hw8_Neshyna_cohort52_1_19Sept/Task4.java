package hw8_Neshyna_cohort52_1_19Sept;

import java.util.Scanner;

public class Task4 {
   /* Task 4 *(Опционально)
    Напишите программу, которая просит пользователя ввести слово "hello".
    Если пользователь вводит правильное слово, программа благодарит его и
    завершает работу. Если вводится неправильное слово, программа продолжает
    запрашивать ввод, пока не будет введено правильное слово.

    Дополнительно: Подсчитайте количество попыток, потребовавшихся для
    ввода правильного слова, и выведите это количество на экран.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int count = 0;true;){

            System.out.println("Type 'Hello'");
            String hello = scanner.nextLine();
            boolean correct = hello.equalsIgnoreCase("hello");
            count++;

            if(correct == true){

                System.out.println("Thank you");
                System.out.println("Attempts: " + count);
                break;

            }else {
                System.out.println("error");

            }
        }
    }
}



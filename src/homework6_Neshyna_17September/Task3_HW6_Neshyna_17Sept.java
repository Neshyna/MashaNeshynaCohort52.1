package homework6_Neshyna_17September;
import java.util.Scanner;
public class Task3_HW6_Neshyna_17Sept {
    /*
    Author: Masha Neshyna
    Date: 16//09/2024

Task 3
1. Попросите пользователя ввести целое число с клавиатуры.
2. Ваша программа должна вывести строку в формате:
Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
3. Проверьте работу вашей программы, вводя разные числа. Убедитесь в правильности выдаваемой строки.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert any number using your keyboard:");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("number:" + number);


        boolean divide = number % 3 == 0;
        System.out.print("number:" + number + " divides 3:" + divide + "; ");

        boolean even = number % 2 ==0;
        System.out.print("number:" + number + " even:" + even + "; ");

        boolean evenDivide = divide & even;
        System.out.print("Number:" + number + " is even and divides 3:" + evenDivide);


        //println  print each time next line
        //printf  join/print all in one line
        /*
        форматирование
        %d целое число
        %f число с плавающей точкой
        %s строка
        %n new line inside println
        \n  new line everywhere



         System.out.printf("Число: %d четное: %s ; кратно 3: %s; четное и кратное 3: %s\n", input, isEven, isDevByThree, isTwice);
        System.out.println("Test");

        // Печатает строку без добавления символа перевода строки
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");

         */





    }
}

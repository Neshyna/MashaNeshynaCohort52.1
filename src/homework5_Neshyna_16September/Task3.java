package homework5_Neshyna_16September;

import java.util.Scanner;

public class Task3 {

     /*
    Author: Masha Neshyna
    Date: 16/09/2024

Task 3* (Опционально)
1. Попросите пользователя ввести строку чётной длины с клавиатуры.
2. Распечатайте два средних символа строки.

Expected result:

Для строки "string" результат будет "ri".
Для строки "code" результат будет "od".
Для строки "Practice" результат будет "ct".
   */
     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Insert even number of symbols using your keyboard:");
          String evenString = scanner.nextLine();
          System.out.println("evenString:" + evenString);

          int halfLength = evenString.length()/2;
          //1st option
          System.out.println("Two middle chars (charAt):" + evenString.charAt(halfLength - 1) + evenString.charAt(halfLength) );
          //2nd option
          System.out.println("Two middle chars (substring):" + evenString.substring(halfLength - 1, halfLength + 1));


          /*
          char firstMiddle = string.charAr(halflength);
          char secondMiddle = string.charAr(halflength -1);
           */
     }
}

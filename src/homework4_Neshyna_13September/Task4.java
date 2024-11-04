package homework4_Neshyna_13September;

public class Task4 {

    //author: Masha Neshyna
    //date: 13/09/2024

   /* Task 4 * (Опционально)
    Напишите программу на Java, которая преобразует ваше имя, записанное маленькими буквами, в верхний регистр.

    Для каждой буквы имени создайте отдельную переменную типа char, инициализированную соответствующей буквой в нижнем регистре.

    Затем преобразуйте каждую букву в верхний регистр, используя только арифметические операции (без использования библиотечных
    функций), и выведите результат.

    */
   public static void main(String[] args) {
       char ch1 = 'm';
       char ch2 = 'a';
       char ch3 = 's';
       char ch4 = 'h';
       char ch5 = 'a';


       System.out.println("name:" + ch1+ch2+ch3+ch4+ch5);


      /* ch1 = (char) (ch1 - 32);
       ch2 = (char) (ch2 - 32);
       ch3 = (char) (ch3 - 32);
       ch4 = (char) (ch4 - 32);
       ch5 = (char) (ch5 - 32);
*/

       ch1 = toUpperCase (ch1);
       ch2 = toUpperCase (ch2);
       ch3 = toUpperCase (ch3);
       ch4 = toUpperCase (ch4);
       ch5 = toUpperCase (ch5);
       System.out.println("NAME:" + ch1+ch2+ch3+ch4+ch5);






   }

   private static char toUpperCase (char c){ //method
       return (char) (c - 32);

   }
}

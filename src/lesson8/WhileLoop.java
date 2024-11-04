package lesson8;

import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {

        /*
        while (condition) {
        loop's body
        code to repeat
        }
         */

        //print numerals from 1 to 5
        int number = 1;

        while (number <= 5) {
            System.out.println(number);
            number++; //number = number + 1
        }
        System.out.println("the loop is finished. the program continues");


       /*
        int y = 5;
        while (y<10){// or you can type true instead of  y<10
            System.out.println(y);//never finished бесконечный цикл
        }*/


        // print numerals from 100 to 90 (including) from biggest to smallest
        System.out.println("===========================");
        int i = 100;// инициализация счетчика
       while (i >= 90) {
           System.out.println(i--);
       }
        //i -- ; i = i - 1



        //Find sum of numbers from 1 to 100
        //перебрать числа от 1 до 100
        //каждое число добавить в какую то переменную, накапливающ сумму чисел
        //
        System.out.println("==================");
        i = 1; //инициализация счетчика
       int sum = 0;
       while (i <= 100) {
           sum += i;// Добавляю текущее значение i к сумме current value of i plus  to sum
           i++;
       }
        System.out.println("sum of numbers from 1 to 100:" + sum);




       //print all even numerals from 1 - 21
        // Вывести на экран все четные числа в диапазоне от 1 до 21
        /*
        Запустить перебор чисел от 1 до 21
        Проверить является ли число четным
            Если четное - распечатать
            Иначе - никаких действий не требуется
        Увеличить счетчик цикла
         */
        System.out.println("==========================");
        i = 1;
        while (i <= 21) {
            if (i % 2 == 0) {//check if  even
                System.out.println("even" + i);
            }
            i++;
        }





            System.out.println("===================");

            //print each symbol of the line on separate line
            //перебрать все индексы от 0 до len.. -1
            //на каждой итерации берем символ по индексу
            // повторить с другим индексом

            String str = "Hello!";
            i = 0;
            // 0,1,2,...len -1
            while (i <= str.length() - 1){
                char ch = str.charAt(i);
                System.out.println(ch);
                i++;
                }





        }


    }


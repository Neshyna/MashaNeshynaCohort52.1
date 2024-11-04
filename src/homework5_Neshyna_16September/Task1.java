package homework5_Neshyna_16September;

import java.util.Scanner;

public class Task1 {
    /*
    Author: Masha Neshyna
    Date: 16/09/2024

    Task 1
1. Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
2. Используя Scanner, сохраните имя в переменную типа String.
3. Выведите на экран количество символов в имени пользователя.
4. Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
5. Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
     */
    public static void main(String[] args) {

        //1.
        Scanner scanner = new Scanner(System.in);
        // insert user's name
        System.out.println("Type your name:");

        //2.
        String name = scanner.nextLine();
        System.out.println("name:" + name);

        //3.
        int length = name.length();
        System.out.println("length:" + length);
        //number of symbols in the line


        //4.
        char firstChar = name.charAt(0);
        System.out.println("firstChar:" + firstChar);
        // take 1st char from the line

        char lastChar = name.charAt(name.length() -1);
        System.out.println("lastChar:" + lastChar);
        //index of the last symbol


        //5. first and last char by the decimal numerals
        char firstChar10 = firstChar;
        System.out.println("firstChar10:" + (int)firstChar10);

        char lastChar10 = lastChar;
        System.out.println("lastChar10:" + (int)lastChar10);








    }
}

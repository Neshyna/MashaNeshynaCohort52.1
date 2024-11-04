package homework6_Neshyna_17September;

public class Task1_HW6_Neshyna_17Sept {

    /*
    Author: Masha Neshyna
    Date: 16//09/2024

    Task 1
Дан текст Programming is fun.

Напишите программу, которая проверяет,
содержит ли эта строка слово “fun”,
и выведите результат в виде булевой переменной.
     */

    public static void main(String[] args) {
        String containsFun = "Programming is fun";
        String verifyStingContainFun = "Does the string contain \"fun\"?:";
        boolean booleanTrue = containsFun.contains("fun");

        System.out.println(containsFun);
        System.out.println(verifyStingContainFun);
        System.out.println("Answer:" + booleanTrue);
    }
}

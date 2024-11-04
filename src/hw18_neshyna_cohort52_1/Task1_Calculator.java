package hw18_neshyna_cohort52_1;
/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение,
вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической
операции, принимающие два аргумента и возвращающие
результат операции.
 */
public class Task1_Calculator {

    public static void main(String[] args) {

        System.out.println("sum: " + sum(5,8));
        System.out.println("subtraction: " + subtraction(4,2));
        System.out.println("division: " + division(21,7));
        System.out.println("productOfNumbers: " + prductOfNumbers(4,5));

    }

    public static int sum (int x, int y){
        int sum = x + y;
        return sum;
    }
    /*public static int sum(int a, int ... ints){
        int sum = a;
        for(int i = 0; i < ints.length, i++){
            sum += ints[i];

        }return  sum;
    }*/
    public static int subtraction(int x, int y){
        int subtraction = x - y;
        return subtraction;
    }
    public static int division (int x, int y){
        if(x == 0){
            return Integer.MAX_VALUE;
        }

        int division = x/y;

        return division;
    }
    public static int prductOfNumbers(int x, int y){
        int productOfNumbers = x * y;
        return productOfNumbers;
    }


}


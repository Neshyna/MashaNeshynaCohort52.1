package hw19_Neshyna_Cohort52_1;
/*
Task 1
Дополните Класс "Калькулятор" из предыдущего домашнего задания
Класс Calculator, который будет предоставлять

- базовые арифметические операции: сложение, вычитание, умножение и деление (сделано в прошлом ДЗ)
- Вычисление длины окружности и площади круга по ее радиусу
Copy
Класс должен содержать:

- Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции ((сделано в прошлом ДЗ))
- Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */
public class Task1_HW19 {

    public static void main(String[] args) {
        System.out.println("circumference: " + circumference(6.5));
        System.out.println("square: " + square(7.4));
    }

    public static final double PI = 3.141519;

    public static double circumference(double radius){

        return (2 * radius )* PI;
    }
    public static double square(double radius){

        return (radius * radius) * PI;
    }

}

package hw17_Neshyna_cohort52_1;
/*
Task 0
Написать класс Employee (Работник)

У него должны быть поля имя, возраст, зарплата

Инкапсулировать класс.

Написать метод info() выводящий информацию о работнике.
 */

public class Employee {

   private String name;
   private int age;
   private int salary;

   public Employee(String name, int age, int salary){
       this.name = name;
       this.age = age;
       this.salary = salary;

   }

   public String Info (){
       return String.format("employee: %s. age: %d . salary: %s: " ,name, age, salary);
   }


}

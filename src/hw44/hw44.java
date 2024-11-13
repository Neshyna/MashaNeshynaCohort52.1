package hw44;

import java.util.*;
import java.util.stream.Collectors;



public class hw44 {
    /*
Task 1
Из списка целых чисел выделите те значения, которые больше 10;
отсортируйте эти значения по значению последней цифры в числе и выведите результат на экране

Task 2
Имеется список строк. Используя Stream API, найдите строку с минимальной длиной.

Task 3
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список

Task 4 Опционально
Напишите метод findUserById(int id), который возвращает Optional<User>.
Метод принимает List<User> и int id.

Если пользователь с заданным id существует в списке, вернуть Optional с пользователем,
иначе вернуть Optional.empty().

Подсказка:
Используйте Optional.of(user) или Optional.empty().
     */

    public static void main(String[] args) {

        task1();
        task2();
        task3();

        //task4
        List<User> users = List.of(
          new User(1, "Heeseung"),
          new User(2, "Jay"),
          new User(3, "Jake"),
          new User(4, "Jungwon"),
          new User(5, "Sunghoon"),
          new User(6, "Sunoo"),
          new User(7, "Niki")
        );

        System.out.println("User with id 2: " + findUserById(users,2));
        System.out.println("User with id 9: " + findUserById(users,9));//not exist

    }

    public static void task1(){

        List<Integer> numbers = List.of(56,4,67,23,9);

        List<Integer> newNumbers = numbers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparing(i -> i % 10))
                .collect(Collectors.toList());

        System.out.println("Task1: " + newNumbers);

    }

    public static void task2(){

        List<String> strings = List.of("Developer","one","list", "Laptop");

        Optional<String> shortest = strings.stream()
                .filter(Objects::nonNull)
                .sorted()
                .min(Comparator.comparing(String::length));

        System.out.println("Task2: " + shortest);
    }

    public static void task3(){

        List<Integer> numbers = List.of(1,2,3,4,5);

        List<Integer> newNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println("Task3: " + newNumbers);
    }

    public static Optional<User> findUserById(List<User> users, int userId){

        for (User user : users)
            if (user.getUserId() == userId)
                return Optional.of(user);

        return Optional.empty();


        /*Optional<User> user = users.stream()
                .filter()
                .peek(System.out::println)
                .findFirst()
                */
    }

}

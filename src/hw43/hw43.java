package hw43;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class hw43 {
    /*
    Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям:
четные, больше 10 и меньше 100

Для фильтрации используйте Stream API

Task 2
Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются на определенную букву (например, "A")
и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Опционально + удалите дубликаты из списка строк

Task 3
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
     */

    public static void main(String[] args) {

        List<Integer> numbers = List.of(11,22,307,4,57,-6,0);
        task1(numbers);

        List<String> strings = List.of("apollo", "anorak", "java", "actually", "actually");
        task2(strings);

        task3();
    }

    private static List<Person> getPersons(){
        return List.of(
                new Person("Harry", 26,"Berlin"),
                new Person("Ron", 27, "London"),
                new Person("Hermione",22, "Porto"),
                new Person("Masha",30, "Berlin")
        );
    }

    public static void task1(List<Integer> numbers){

        List<Integer> newNumbers = numbers.stream()
                .filter(i -> i > 10)
                .filter(i -> i < 100)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(newNumbers);

    }

    public static void task2(List<String> strings){
        CharSequence a = "a";
        List<String> newStrings = strings.stream()
                .filter(string -> string.contains(a))
                .sorted()
                .distinct()//delete duplicate
                .collect(Collectors.toList());

        System.out.println(newStrings);
    }

    public static void task3(){

        List<Person> persons = getPersons();

        List<String> newPersons = persons.stream()
                .filter(person -> person.getAge() > 25)
                .filter(person -> person.getCity().equals("Berlin"))
                .map(person -> person.toString())
                .collect(Collectors.toList());

        System.out.println(newPersons);

    }
}

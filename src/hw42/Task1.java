package hw42;

import java.util.HashMap;

public class Task1 {
    /*
    Task 1
Напишите программу, которая проверяет, являются ли две заданные строки анаграммами (то есть содержат ли они одинаковые буквы в разном порядке).

Инструкции:
Используйте HashMap<Character, Integer> для подсчета количества каждого символа в строках.
Сравните две карты, чтобы определить, являются ли строки анаграммами.
P.S.
Метод equals() для карт в Java сравнивает карты на основе их содержимого — пар ключ-значение — независимо от порядка ключей.

Это означает, что если две карты содержат одинаковые пары ключ-значение, то метод equals() вернет true, даже если порядок добавления или хранения этих пар различается.
     */

    public static void main(String[] args) {

        String string1 = "abcde";
        String string2 = "edcba";

        char[] arrayChar1 = string1.toCharArray();
        HashMap<Character, Integer> map1 = new HashMap<>();

        for (char ch : arrayChar1) {
            Integer count1 = map1.getOrDefault(ch, 0);
            map1.put(ch, count1 +1);
        }

        System.out.println(map1);

        char[] arrayChar2 = string2.toCharArray();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : arrayChar2) {
            Integer count2 = map2.getOrDefault(ch, 0) ;
            map2.put(ch, ++count2);
        }

        System.out.println(map2);

        if (map1.equals(map2)) {
            System.out.println("are anagrams");
        } else {
            System.out.println("not anagrams");
        }
    }

}
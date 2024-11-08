package hw42;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    /*
    Task 2
Подсчет слов по длине
Напишите программу, которая подсчитывает количество слов определенной длины в заданном тексте (строке).

Инструкции:
Используйте HashMap<Integer, Integer>, где ключом является длина слова, а значением — количество слов этой длины.
Прочитайте текст и обновите карту соответствующим образом.
Выведите результаты подсчета.
     */

    public static void main(String[] args) {

        String string = "java download code develop job love son";

        String[] words = string.split("\\s+");

        HashMap<Integer,Integer> map = new HashMap<>();

        for (String word : words){

            /*
            long variant:
            Integer length = word.length();
            Integer countWords = map.getOrDefault(word.length(), 0);
            map.put(length, ++countWords);
            */

            //short variant
            map.put(word.length(), map.getOrDefault(word.length(),0) +1);
        }

        System.out.println(map);

    }
}

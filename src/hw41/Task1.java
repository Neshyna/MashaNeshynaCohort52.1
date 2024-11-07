package hw41;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    /*
    Task 1
    Частотный словарь слов: Напишите метод,
    который принимает строку текста и возвращает Map<String, Integer>,
    где каждому слову соответствует количество его вхождений в текст.
     */

    public static void main(String[] args) {

        String string = "text text test test test java code code code code";

        Map<String,Integer> frequencyDictionary =  frequencyDictionary(string);

        System.out.println("Words frequency: " + frequencyDictionary);

    }

    public static Map<String, Integer> frequencyDictionary(String string){

        Map<String,Integer> frequencyWords = new HashMap<>();

        //split sting to array (regular expression)
        String[] arrayWords = string.split( "\\s+");

        // Loop through each word and count its frequency
        for (String word : arrayWords) {

            Integer count = frequencyWords.get(word);// get return value by key

            if (count == null) {
                count = 0;
            }

            frequencyWords.put(word, count + 1);//add a pair
        }

        return frequencyWords;
    }
}

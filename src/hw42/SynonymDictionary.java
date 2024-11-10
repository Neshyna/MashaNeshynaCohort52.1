package hw42;

import java.util.*;

public class SynonymDictionary {
    /*
    Task 3 Опционально
Словарь синонимов
Реализуйте простой словарь синонимов, где каждому слову соответствует список его синонимов.

Инструкции:
Используйте HashMap<String, List> для хранения слов и их синонимов.
Реализуйте функции для добавления синонимов к слову и получения списка синонимов для заданного слова.
Предусмотрите возможность обновления и удаления синонимов.
Создать класс SynonymDictionary, который будет содержать HashMap<String, List> для хранения данных.
Реализовать методы:
addSynonym(String word, String synonym) — добавляет синоним к слову.
getSynonyms(String word) — возвращает список синонимов для заданного слова.
updateSynonyms(String word, List synonyms) — обновляет список синонимов для слова.
removeSynonym(String word, String synonym) — удаляет синоним из списка синонимов слова.
removeWord(String word) — удаляет слово и все его синонимы из словаря.
     */


    private static Map<String,List<String>> map = new HashMap<>();

    /*
    //create initial map if needed with key and empty list
    public static void init(List<String> words){  // list of keys

        for (String word : words) { //for each loop in case when several keys accepted
            map.put(word, new ArrayList<>());
        }
    }
    */

    public static void addSynonym(String word, String synonym){

       List<String> synonyms = map.get(word);

        if (synonyms == null) {//when there is no key, crete a new map (same as at init method)
            map.put(word, new ArrayList<>());
        }

       map.get(word).add(synonym);
    }

    public static List<String> getSynonym(String word){
        return map.get(word);
    }

    public static void updateSynonyms(String word, List<String> synonyms){
        map.replace(word,synonyms);
    }

    public static void removeSynonym(String word, String synonym){
        map.get(word).remove(synonym);
    }

    public static void removeWord(String word){
        map.remove(word);
    }

    public static void printMap(){
        System.out.println(map);
    }
}

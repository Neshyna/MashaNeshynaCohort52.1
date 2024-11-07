package hw40;

import java.util.*;

public class Task1 {
    /*
    Task 1
    Напишите метод, принимающий строку и возвращающий Список ее слов без повторений,
    отсортированный в порядке увеличения длин слов.
    Если строки имеют одинаковую длину - сортировать в естественном порядке
     */

    public static void main(String[] args) {

        System.out.println(wordsList("Test text to return words list without duplicates sorted from smallest word to longest word"));
    }

    public static List<String> wordsList(String phrase ){

        String testPhrase = phrase.replaceAll("[^ a-zA-Z0-9a-яА-Я]", "");

        String[] arrayWords = testPhrase.split(" ");//   \\s+
        System.out.println("arrayWords: " + arrayWords);

        Comparator<String> wordLengthComp = new Comparator<String>() {
            @Override
            public int compare(String w1, String w2) {
                int wordLength = w1.length() - w2.length();
                if (wordLength == 0){
                    return w1.compareTo(w2);//natural order lexicographically
                };
                return wordLength;
            }
        };

        Arrays.sort(arrayWords, wordLengthComp);
        System.out.println("compared array:");
        System.out.println(Arrays.toString(arrayWords));

        List<String> listWords = Arrays.asList(arrayWords);
        System.out.println("listWords: " + listWords);

        List<String> listWithoutDuplicates = getUniqueList(listWords);
        System.out.println("list without duplicates: " + listWithoutDuplicates);

        return listWithoutDuplicates;
    }

    public static List<String> getUniqueList(List<String> listWords){

        Set<String> uniqueElemList = new LinkedHashSet<>(listWords);

        return new ArrayList<String>(uniqueElemList);

    }
}
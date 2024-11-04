package hw14_Neshyna_cohort52_1;

import java.util.Scanner;

public class Task4_HW14_Neshyna_Cohort52_1 {
    /*Task 4 * (Опционально)
    Подсчет гласных и согласных
    Напишите программу, которая просит пользователя ввести слово и
     подсчитывает количество гласных и согласных букв в этом слове.
     */
    public static void main(String[] args) {

        System.out.println("count vowels: " + countVowels(insertWord()));

    }

    public static String insertWord() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = scanner.nextLine();
        System.out.println("Word inserted: " + word);
        return word;
    }

    public static int countVowels(String word) {

        int countVowels = 0;
        int countConsonants = 0;
        int countNumerals = 0;
        int countSpecialSymbols = 0;
        int spaceCount = 0;


        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        char[] numerals = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] specialSymbols = {'!', '@', '#', '$', '%', '&', '*', '?'};

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            for (int j = 0; j < vowels.length; j++) {
                if (c == vowels[j]) {
                    countVowels++;
                }
            }
            for (int k = 0; k < consonants.length; k++) {
                if (c == consonants[k]) {
                    countConsonants++;
                }
            }
            for (int x = 0; x < numerals.length; x++) {
                if (c == numerals[x]) {
                    countNumerals++;
                }
            }
            for (int y = 0; y < specialSymbols.length; y++) {
                if (c == specialSymbols[y]) {
                    countSpecialSymbols++;
                }
            }
        }

            System.out.println("count special symbols: " + countSpecialSymbols);
            System.out.println("count consonants: " + countConsonants);
            System.out.println("count numerals: " + countNumerals);

            System.out.println("word length: " + word.length());

            int notListedSpecialSymbolsAndSpaces = word.length() - countVowels - countNumerals - countConsonants - countSpecialSymbols;
            System.out.println("notListedSpecialSymbolsAndSpaces: " + notListedSpecialSymbolsAndSpaces);

            return countVowels;
        }
    }



package hw9_Neshyna_cohort52_1_20Sept;

public class Task5_HW9_Neshyna_cohort52_1_20Sept {
    /*
    Task 5
Написать метод, который принимает массив строк.
Вывести на экран все символы самой длинной строки из массива.

     */

    public static void main(String[] args) {

        String[] array = {"One", "Two", "Twenty"};

        findLongestString(array);

    }//method body

    public static void findLongestString (String[] array){

        int i = 0;//счетчик

        int maxIndex = 0;//кол символов в самом длин элементе

        String longestString = "";//самая длин строка

        while (i < array.length) {
                if (array[i].length() > maxIndex) {
                maxIndex = array[i].length();
                longestString = array[i];
                }
                i++;
                }
        System.out.println(longestString);
    }

}//end class

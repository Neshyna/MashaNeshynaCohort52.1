package hw10_Neshyna_cohort52_1_20Sep;

public class Task2_HW10_Neshyna_cohort52_1_23Sept {
    /*
    Task 2
Написать метод, принимающий на вход массив строк.
Метод должен вернуть массив, состоящий из самой короткой
и самой длинной строки изначального массива.
     */
   public static void main(String[] args) {

        String[] array = {"One", "Two", "Twenty", "Go"};

        printArray(maxMinStringArray(array));
   }

    public static String[] maxMinStringArray(String[] array) {


        String longestString = "";//самая длин строка
        String shortestString = "";
        int maxLength = 0;
        int minLength = Integer.MAX_VALUE;

        for (int j = 0; j < array.length; j++){

                if (array[j].length() > maxLength) {
                    maxLength = array[j].length();
                    longestString = array[j];
                }
                if (array[j].length() < minLength) {
                    maxLength = array[j].length();
                    shortestString = array[j];
                }
            }

            return new String[] {shortestString, longestString};
        //new array created

        }

        public static void printArray(String[] array){
            System.out.print("[");
            int i = 0;
            while (i < array.length){
                System.out.print(array[i] + ((i < array.length -1) ? "," : "]\n"));
                i++;
            }
        }
    }

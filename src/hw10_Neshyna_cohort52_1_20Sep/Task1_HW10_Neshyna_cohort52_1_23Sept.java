package hw10_Neshyna_cohort52_1_20Sep;

public class Task1_HW10_Neshyna_cohort52_1_23Sept {
   /* Task 1
    Написать метод со следующим функционалом:

    На вход метод принимает массив целых чисел и число - длину нового массива.
     Метод должен создать и распечатать массив заданной в параметрах длинны.
     В начало массива должны быть скопированы элементы из входящего массива:

    {0, 1, 2, 3, 4, 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}
    Copy
    {0, 1, 2} -> copyOfArray(array, 5) -> вывод на печать {0, 1, 2, 0, 0}*/

   public static void main(String[] args) {

       int [] array = {0, 1, 2, 3, 4, 5, 6};

       printArray(array, 10);

   }
   public static void printArray (int [] array, int newArrayLength) {

       int[] array2 = new int[newArrayLength];//new array created


       for (int i = 0; i < newArrayLength; i++) {

           if (i < array.length) {
               ;//print 1st 3 elements
               array2[i] = array[i];//copy array with for loop

           } else {
               array2[i] = 0;
           }

       System.out.println(array2[i]);
   }

       }

    }



package hw10_Neshyna_cohort52_1_20Sep;

public class Task3_HW10_Neshyna_cohort52_1_23Sept {
    /*
    Task 3
Написать метод, принимающий на вход массив целых чисел.
Метод должен вернуть массив, состоящий только из простых чисел,
 присутствующих в изначальном массиве
 вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
     */
   public static void main(String[] args) {

        int [] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};

        printArray(findPrimeNumbers(array));

    }
   public static int[] findPrimeNumbers (int [] array) {

       int[] array2 = new int[array.length];//new array created

       int j = 0;


       for (int i = 0; i < array.length; i++) {
          if (isPrimeNumber(array[i])) {
             array2[j++] = array[i];
          }
       }
       return array2;
   }

public static boolean isPrimeNumber (int x){

      if(x < 2){
         return false;
      }

      for (int i = 2; i < x; i++) {
         if (x % i == 0) {
            return false;
         }

      }
      return true;
}
   public static void printArray(int[] array){
      System.out.print("[");
      int i = 0;
      while (i < array.length){
         System.out.print(array[i] + ((i < array.length -1) ? "," : "]\n"));
         i++;
      }
   }
       //prime number p % 1 = 0; p != 1; p % p = 0
}


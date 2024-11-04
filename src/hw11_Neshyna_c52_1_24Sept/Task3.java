package hw11_Neshyna_c52_1_24Sept;

public class Task3 {
    /*Task 3 * (Опционально)
    Написать метод, который проверяет,
    является ли массив палиндромом
    (читается одинаково с обоих концов).
     */
    public static void main(String[] args) {

        int[] array = {5,8,9,10,9,8,5};
        System.out.println(isPalindrome(array));
    }
    public static boolean isPalindrome (int[] array){
        if (array == null|| array.length == 0){
            return false;
        }

       /*
       array [0]-array[n-0 -1]
       array [0+1]-array[n-1 -1]
       array [0+2]-array[n-1 -2]
       array [0+3]-array[n-1 -3]
        */


        int n = array.length;
        for (int i = 0; i < n / 2; i++){
            if( array[i] != array[n -1 -i]){
                    return false;
            }
        }
        return true;
    }
}

package hw11_Neshyna_c52_1_24Sept;

import java.util.Arrays;

public class Task4 {
    /*
    Task 4 * (Опционально)
Написать метод, который удаляет все
вхождения заданного числа из массива
и возвращает новый массив без этого числа.
     */
    public static void main(String[] args) {
        int[] array = {2,3,4,5,6,7};
        int[] res = removeElements(array, 6);

        System.out.println(Arrays.toString(res));
    }
    public static int[] removeElements(int[] array, int element){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == element)
                count++;
        }
       // if (count == 0) return  array;

        int[] result = new int[array.length - count];


        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] != element){
                result[j] = array[i];
            j++;
            }
        }
        return result;
    }

}

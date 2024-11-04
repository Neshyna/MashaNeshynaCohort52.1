package hw8_Neshyna_cohort52_1_19Sept;

import java.util.Random;

public class T6short {
    public static void main(String[] args) {

        Random random = new Random();
        int masLen = 5 + random.nextInt(11); //[5...15] рандомно выбирает колл ячеек
        int[] arrays = new int[masLen];
        int numerals = 0;

        System.out.print("print all :" );
        while (numerals < arrays.length) {
            arrays[numerals] = random.nextInt(100) - 50;
            System.out.print(arrays[numerals]);

            if (numerals < arrays.length -1){
                System.out.print(", ");
                //что бы после последнего элемента не печаталась еще одна запятая
            }
            else {
                System.out.println(".");
            }
            numerals++;
        }


        int min2 = arrays[0];
        int max2 = arrays[0];
        int sum2 = 0;

        int i = 0;
        while (i < arrays.length) {
            sum2 += arrays[i];
            if (arrays[i] < min2) min2 = arrays[1];
            if (arrays[i] > max2) max2 = arrays[1];
            i++;
    }
         System.out.println("Max value: " + max2);
         System.out.println("Min value: " + min2);
         System.out.println("Average:" + sum2/ (double) masLen );


    }
}

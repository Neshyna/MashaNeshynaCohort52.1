package lesson12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args) {

        int[] ints = {34,35,56,46,2,3,5,6,23,4,58};
        System.out.println(ints.length);

        int index = ArraysUtils.linearSearch(ints, 100);
        //linea search. found element with index 100
        System.out.println("index:" + index);

        System.out.println("Array before sorting:" );
        System.out.println(Arrays.toString(ints));

        ArraysUtils.sortSelectLocation(ints);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(ints));


        int number = 3;
        int idx = ArraysUtils.binarySearch(ints, number);
        System.out.println("index of the number in the array:" + idx);


        int[] testArray = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < testArray.length; i++){
            testArray[i] = random.nextInt(10_001);
        }

        System.out.println("===========================");
        ArraysUtils.sortSelectLocation(testArray);
        number = 9900;
        idx = ArraysUtils.binarySearch(testArray,number);
        System.out.println("number index in testArrays (binary) " + idx);

        idx =ArraysUtils.linearSearch(testArray,number);
        System.out.println("number index in testArrays (linea) " + idx);
    }
}

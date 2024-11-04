package hw9_Neshyna_cohort52_1_20Sept;

public class Task1AnotherVariant {
    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArrayWhile(array, 2);
        printReverseArrayFor(array, 2);

        System.out.println("Reverse without index ");
        printReverseArrayWhile(array);

        System.out.println("Reverse with boolean ");
        printReverseArrayWhile(array, true);
        printReverseArrayWhile(array, false);

    } // Method area

    public  static  void  printReverseArrayWhile (int[] arr, int index) {
        System.out.print("[");
        int i = 0;
        while (i < index) {
            System.out.print(arr[i] + ", ");
            i++;
        }

        i = arr.length - 1;
        while (i >= index) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
            i--;
        }
    }

    public  static  void  printReverseArrayWhile (int[] arr) {
        printReverseArrayWhile(arr, 0);
    }

    public  static  void  printReverseArrayWhile (int[] arr, boolean flag) {
        if (flag) {
            // flag = true
            printReverseArrayWhile(arr);
        } else {
            printReverseArrayWhile(arr, arr.length - 1);
        }
    }


    public  static  void  printReverseArrayFor (int[] arr, int index) {
        System.out.print("[");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + ", ");
        }
        for (int i = arr.length - 1; i >= index ; i--) {
            System.out.print(arr[i] + (i != index ? ", " : "]\n"));
        }
    }


}

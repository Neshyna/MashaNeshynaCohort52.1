package lesson9;

public class MethodEx2 {
    public static void main(String[] args) {

        int temp = 5;
        System.out.println("1: " + temp);

        changeMe(temp);
        System.out.println("2: " + temp);

        String string = "Java";
        changeMe(string);
        System.out.println("3: " + string);


        int[] arr = {0, 1, 2, 3, 4, 5};
        changeMe(arr);
        printArray(arr);




    }


    //method area

    public static void changeMe(int[] array) {
        array[0] = 1000;
    }


    public static void changeMe(String str) {
        str = str + "!!!";
        System.out.println(str);
    }

    public static void changeMe(int x) {
        x = 100;

    }

    public static void printArray(int[] array){
        System.out.print("[");
        int i = 0;
        while (i < array.length){
            System.out.print(array[i] + ((i < array.length -1) ? "," : "]\n"));
            i++;
        }
    }
}

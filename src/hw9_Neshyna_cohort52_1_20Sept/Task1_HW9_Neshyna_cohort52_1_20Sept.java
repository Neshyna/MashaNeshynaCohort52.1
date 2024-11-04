package hw9_Neshyna_cohort52_1_20Sept;
/*
Task 1
Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

{1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке Если флаг == false -> печатает массив в прямом порядке


 */
public class Task1_HW9_Neshyna_cohort52_1_20Sept {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};

       printArray(array);
       reverseOrder(array);
       reverseOrder(array, 3);
       reverseOrder(true, array);

    }
   // method space

    public static void printArray(int[] array){

        System.out.print("[");

        int i = 0;

        while (i < array.length) {
            System.out.print(array[i++]);

            if(i > array.length -1) {
                System.out.println("]");
            }
            else {
                System.out.print(",");
            }
        }
    }

    public static void reverseOrder(int[] array) {

        System.out.print("[");

        int i = array.length;

        while (i > 0) {
            System.out.print(array[--i]);

            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
    public static void reverseOrder(int[] array, int x){
        int i = 0;
        while(i < x) {
            System.out.print(array[i++] + " ");//normal
        }

        int j = array.length;
        while (j > x) {
            System.out.print(array[--j] + " ");//reverse
        }
        System.out.println();

        // option 2 with if else construction
        i = 0;
        j = 0;
        while (j <= array.length) {
            if (i < x) {
                //normal
                System.out.print(array[i++] + " ");
            } else if (i == x) {
                i = array.length;
            } else {
                // reverse
                System.out.print(array[--i] + " ");
            }
            j++;

        }
        System.out.println();
    }



    public static void reverseOrder (boolean flag, int[] array){

       //shortest option when there are already given methods
        if (flag) {
            reverseOrder(array);
        } else {
            printArray(array);
        }

        //ternary

        int i = flag ? array.length : 0;

        while (flag ? (i> 0) : (i < array.length)) {
            System.out.print(array[flag ? --i : i++]);
        }




    }

}//end class


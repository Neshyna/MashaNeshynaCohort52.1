package lesson12;

public class ArraysUtils {
    /*
    метод линейного поиска элемента в массиве
    осуществл перебором всех элементов и сравниванием
    с искомым значением
    если значений найдено - возвращ индекс элемента массива
    если не найдено - возвращ -1


    однознач сказать что число отсутствует в массиве?
    потребуется перебрать абсолютно все элементы массива -> 0 (n)
     */
    public static int linearSearch(int[] array,int searchValue){
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            counter++;
            if (array[i] == searchValue){
                System.out.println("linea search found. steps: " + counter);
                return i;
            }
        }
        System.out.println("linea search not found. steps:" + counter);
        return  -1;
    }
    //method to search min value in the array
    public static int minIndex(int[] array){
        int min = array[0];
        int minIndex = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){

                min = array[i];
                minIndex = i;
            }
        }
        return  minIndex;
    }
    //method to search min value at some part of array from start
    // index and till the end of the array
    public static int minIndex(int[] array, int startIndex){

        int min = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < array.length; i++){
            if (array[i] < min){

                min = array[i];
                minIndex = i;
            }
        }
        return  minIndex;
    }
    //sorting
    /*
     Описания алгоритма сортировки:
 ● Выбирается минимальный элемент массива
 ● минимальное значение меняется местами с первым элементом
 выбором.
 ● Вторая итерация - выбирается мин элемент из оставшейся части массива
 ● меняется местами с первым из оставшихся
     */
    public static void sortSelectLocation (int[] array){

        for (int i = 0; i < array.length; i++){

            int localMin = minIndex(array,i);

            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;
        }
    }

    //binary search
    public static int binarySearch(int[] array, int searchValue){

        int startIndex = 0;
        int endIndex = array.length -1;
        int middleIndex;

        int counter = 0;

        //check that a part of array can be separated /2
        while (startIndex <= endIndex){//1.0 <= 12

            counter++;

            //need to find middle index


            middleIndex = startIndex + ((endIndex - startIndex)/2);

            if (array[middleIndex] == searchValue){
                System.out.println("found by " + counter + " steps");
                return middleIndex;
                //compare the value in the middle of the array
                // and the value we search
            }
            if (array[middleIndex] > searchValue){
                endIndex = middleIndex -1;
                //when values are not equal,
                // we find which part of the array we remove
            }else {
                startIndex = middleIndex +1;
            }
        }
        //if while is finished and there is no more array parts to divide
        //it means there is no search value in the array

        System.out.println("Value not found. Streps:" + counter);
        return -1;

    }

}

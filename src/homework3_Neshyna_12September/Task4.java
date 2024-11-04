package homework3_Neshyna_12September;

public class Task4 {

    /*
    Task 3 * (Опционально)
Найдите в Интернете данные по температуре в вашем
 городе за прошедшую неделю (или придумайте :) ).

Вычислите среднюю температуру за неделю и выведете
ее на печать.

Task 4. Теоретический
Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?

Ответ: При делении на 2 могут получиться остатки 0 и 1.
       При делении на 3 могут получиться остатки, которые меньше 3. То есть 2, 1 и 0.
     */

    public static void main(String[] args) {

        int temperature1 = 21;
        int temperature2 = 22;
        int temperature3 = 23;
        int temperature4 = 24;
        int temperature5 = 25;
        int temperature6 = 26;
        int temperature7 = 27;

        int days =7;
        int sumTemperature = temperature1 + temperature2 + temperature3 + temperature4 + temperature5 + temperature6 + temperature7;

        System.out.println("sumTemp:" + sumTemperature);

        //double avarageTemp =  sumTemperature / days;//обрез дробная часть
        double avarageTemp = (double) sumTemperature / days;

        System.out.println("averageTemp:"+ avarageTemp);



    }
}

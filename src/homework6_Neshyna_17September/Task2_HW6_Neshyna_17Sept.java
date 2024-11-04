package homework6_Neshyna_17September;
import java.util.Random;
public class Task2_HW6_Neshyna_17Sept {
    /*
    Author: Masha Neshyna
    Date: 16//09/2024

    Task 2
Создайте две переменные типа int.

В первую переменную запишите случайное значение от 0 до 50.
Во вторую переменную случайное значение от 0 до 100.
(опционально) Во вторую переменную случайное значение от -20 до 30.

Проверьте:

равны ли переменные,

не равны ли они,

больше ли a, чем b,

и меньше ли b, чем a.

Выведите результат на экран.
     */

    public static void main(String[] args) {

        Random random = new Random();
        int randomValue1 = random.nextInt(50 +1);
        // 51 [0..50] - 20 = [-20.. 30]// +1  не обязательно
        int randomValue2 = random.nextInt(100 + 1);//101

        // option 1
        int randomValueOptional1 = random.nextInt(50 + 1) - 20;
        // если выдает напр 34 от него отнимаем -20 или если дает 0 от него -20

        //option 2
        int left = -20;
        int right = 30;
        int randomValueOptional2 = random.nextInt(right - left + 1) + left;
        //(30 - (-20) +1) + (-20)//(max - min + 1 )+ min;


        System.out.println("random value 1:" + randomValue1);
        System.out.println("random value 2:" + randomValue2);
        System.out.println("random value 3(optional):" + randomValueOptional1);
        System.out.println("random value 3(optional):" + randomValueOptional2);



        boolean equalValues = (randomValue1 == randomValue2);
        boolean notEqualValues = (randomValue1 != randomValue2);
        boolean moreValue = (randomValue1 > randomValue2);
        boolean lessValue = (randomValue1 > randomValue2);

        System.out.println("Are randomValue1 and randomValue2 equal? :" + equalValues);
        System.out.println("Are randomValue1 and randomValue2 not equal? :" + notEqualValues);
        System.out.println("Is randomValue1 > randomValue2? :" + moreValue);
        System.out.println("Is randomValue1 > randomValue2? :" + lessValue);
    }
}

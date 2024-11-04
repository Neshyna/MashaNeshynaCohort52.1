package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Random;

public class Task5_HW7_Neshyna_cohort52_1_18Sept {
    /*
    Task 5 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система.
Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
     */
    public static void main(String[] args) {

        Random random = new Random();
        int notes = random.nextInt(13); //12 + 1 // 0...12
        System.out.println("What notes do you have today?:" + notes);

        int time1 = 15;
        int time2 = 30;
        int time3 = 45;
        int time4 = 60;
        int timeTodayLeft = 45;


        switch (notes){
            case 10: case 11: case 12:
                System.out.println("I'm happy! " + (time4 + timeTodayLeft) + " minutes are left to watch TV.");
                //45+60 = 105 minutes or 1,45h
                break;
            case 7: case 8: case 9:
                System.out.println("Well done! Remained time: " + (timeTodayLeft + time3) + " minutes.");
                //45+45=1 h 30 m = 90m
                break;
            case 4: case 5: case 6:
                System.out.println("Ok. You can watch TV " + (timeTodayLeft + time1) + " minutes.");
                //45+15 = 1 h = 60 m
                break;
            case 3:
                System.out.println("It's sad! Only " + (timeTodayLeft - time2) + " minutes today.");
                //45-30 = 15 minutes
                break;
            default:
                System.out.println("No TV today!");//less than 3

        }

    }
}

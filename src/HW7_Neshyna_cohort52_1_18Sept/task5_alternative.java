package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Random;

public class task5_alternative {
    public static void main(String[] args) {
        Random rand = new Random();
        int note = rand.nextInt(13);

        System.out.println("Оценка: " + note);

        int time = 45;
        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("как вы рады");
                time += 60;
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("похвалите ребенка");
                time += 45;
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("нейтрально отнеситесь");
                time += 15;
                break;
            case 3:
                System.out.println("огорчитесь");
                time -= 10;
                break;
            case 2:
            case 1:
            case 0:
                System.out.println("запретите телевизор");
                time = 0;
                break;
            default:
                System.out.println("Опять подрисовывал оценки в дневнике?");
        }

        if (time > 60) time = 60;
        if (time < 0) time = 0;

        System.out.println("Остаток времени на сегодня: " + time);
    }
}
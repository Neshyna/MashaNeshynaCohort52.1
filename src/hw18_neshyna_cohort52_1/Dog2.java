package hw18_neshyna_cohort52_1;

import java.util.Random;

public class Dog2 {
     /*
Task 2 * (Опционально)
Написать класс Собака (Dog).

Каждая Собака обязательно должна иметь имя и высоту прыжка

Должна уметь прыгать и должна уметь тренироваться.

За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров

Максимальная высота прыжка, которую может натренировать собака, не может быть больше,
чем двукратная высота первоначального прыжка.

Также должен быть метод взять jumpBarrier. В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает. Если не в состоянии, нужно проверить помогут ли тренировки
(будет ли данная собака в принципе в состоянии взять барьер). Если да -> идем тренироваться -> берет барьер
 */



    String name;
    int currentJumpHeight;
    int initialJumpHeight;
    int maxJumpHeight;

    public Dog2(String name, int initialJumpHeight){

        this.name = name;
        this.initialJumpHeight = initialJumpHeight;
        this.currentJumpHeight = initialJumpHeight;
        this.maxJumpHeight = initialJumpHeight * 2;
    }
    private void jump(){

        System.out.println("jump");

    }
    private void train(){
        System.out.println("train");
        currentJumpHeight += 10;

    }

    public void jumpBarrier(int barierHihght){

        if (barierHihght > maxJumpHeight) {
            System.out.println("not able to jump");
        } else {

        while (currentJumpHeight < barierHihght) {
            System.out.println("needs training");
            train();
        }
        jump();
        System.out.println("done");
        }
    }
    public void randomValuesForArray(){

        Random random = new Random();

        int[] barrierArray = new int[7];

        int k = 0;

        System.out.print("[");
        while (k < barrierArray.length) {
            barrierArray[k] = 70 + random.nextInt(101) ;
            System.out.println(barrierArray[k] + " , ");
            k++;
        }
        System.out.println("]");
    }
}

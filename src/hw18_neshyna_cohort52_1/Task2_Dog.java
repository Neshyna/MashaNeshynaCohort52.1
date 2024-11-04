package hw18_neshyna_cohort52_1;

public class Task2_Dog {
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

    public Task2_Dog(String name, int initialJumpHeight){

        this.name = name;
        this.initialJumpHeight = initialJumpHeight;
        this.currentJumpHeight = initialJumpHeight;
        this.maxJumpHeight = initialJumpHeight * 2;
    }

    public void jump(){
        System.out.println("done");
    }

    public void train(){
        System.out.println("training needed");
        currentJumpHeight += 10;
    }

      //return 1 if dog can jump after training, 0 jump now ,-1 never

    public int jumpBarrier(int barierHihght){

        if (barierHihght > maxJumpHeight) {
            System.out.println("not able to jump");
            return -1;
        }
        if (currentJumpHeight >= barierHihght) {
            return 0;
        }
        return 1;
        }
    }




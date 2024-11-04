package hw22.task1;
/*
Task 1
Напишите иерархию классов человек -> спортсмен-любитель -> спортсмен-профи

У человека есть метод бежать (run()). Обычный человек бежит со скоростью 10 км, любитель 15, профи - 25;

Также у наших спортсменов есть необходимость в отдыхе. Человек нужен отдых после пробежки 15 минут, любитель 10, профи 5

В методе бежать - вызвать метод, который будет выводить количество минут, необходимых для отдыха спортсменам
 */
public class Human {

    private String name;
    private int speed;
    private int restTime;

    private AthleteAmateur athleteAmateur;

    public Human(String name, int speed, int restTime) {
        this.name = name;
        this.speed = speed;
        this.restTime = restTime;
    }

    public void run(){
        rest();
    }

    private void rest(){
        System.out.printf("I am %s. My speed is %d km/h. My rest time is %d minutes. \n",getName(), getSpeed(),getRestTime());
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("I ");
        sb.append("am ").append(getName());
        sb.append(". I run with a speed ").append(getSpeed()).append(" km/h. ");
        sb.append("My rest time is ").append(getRestTime()).append(" minutes.");
        return sb.toString();

    }

    public int getRestTime() {
        return restTime;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }


}

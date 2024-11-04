package hw24.task1;

public class Triatlette implements Swimmer,Runner{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    public static void main(String[] args) {

        Triatlette triatlette = new Triatlette();
        triatlette.run();
        triatlette.swim();
    }
}

package hw22.task1;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Human",10,15);
        human.run();

        AthleteAmateur athleteAmateur = new AthleteAmateur("Amateur",15,10);
        athleteAmateur.run();

        AthleteProfi athleteProfi = new AthleteProfi("Profi",25,5);
        athleteProfi.run();

        //one more option to print
        System.out.println("==================");
        System.out.println(human.toString());
        System.out.println(athleteAmateur.toString());
        System.out.println(athleteProfi.toString());
    }
}

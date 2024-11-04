package hw26;

public class PairMain {

    public static void main(String[] args) {

        Pair <String> pair = new Pair<>("Masha","Neshyna");
        System.out.println(pair.getFirstElement());
        System.out.println(pair.getSecondElement());

        pair.swap();
        System.out.println(pair.getFirstElement());
        System.out.println(pair.getSecondElement());

        Pair <Double> pair1 = new Pair<>(12.3,45.6);
        System.out.println(pair1.getFirstElement());
        System.out.println(pair1.getSecondElement());

        pair1.swap();
        System.out.println(pair1.getFirstElement());
        System.out.println(pair1.getSecondElement());
    }
}

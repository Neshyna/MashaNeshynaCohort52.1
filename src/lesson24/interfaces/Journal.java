package lesson24.interfaces;

public class Journal implements Printable {

    String name;
    int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.printf("journal %s #%d\n", name, number);
    }

    @Override
    public void test() {
        System.out.println("test journal");

    }
}

package lesson21;

public class Passenger {
    private final int id;
    private static int countrerID;
    private String name;

    public Passenger(String name) {
        this.name = name;
        this.id = ++countrerID;
    }

    public String toString() {
        return "Passenger id:" + id + "name" + name;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


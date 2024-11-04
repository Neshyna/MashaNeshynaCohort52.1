package hw23;

public class Warrior extends GameCharacter{

    public Warrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with a sword");
    }
}

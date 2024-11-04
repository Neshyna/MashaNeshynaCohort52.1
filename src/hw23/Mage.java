package hw23;

public class Mage extends  GameCharacter{

    public Mage(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with a spell");
    }
}

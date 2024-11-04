package hw23;

public class Archer extends GameCharacter{

    public Archer(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks with bow and arrow");
    }
}

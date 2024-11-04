package hw23;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("warrior");
        Mage mage = new Mage("mage");
        Archer archer = new Archer("archer");

        arrayGameCharachter();
        //GameCharacter gameCharacter = new GameCharacter();
        //i.e. mage.arrayGameCharachter; //if created in game character class
        //exeCute array with a help of child class, because can't create object of abstract class GameCharacter here
        //array can be executed by child class as well as it inherits all methods


    }
    public static void arrayGameCharachter(){

        GameCharacter[] gameCharacters = new GameCharacter[3];

        GameCharacter warrior = new Warrior("warrior");
        GameCharacter mage = new Mage("mage");
        GameCharacter archer = new Archer("archer");

        gameCharacters[0] = warrior;
        gameCharacters[1] = mage;
        gameCharacters[2] = archer;

        for(int i = 0; i < gameCharacters.length; i++){
            gameCharacters[i].attack();
        }


    }

}

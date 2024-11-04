package hw15_Neshyna_cohort52_1;

public class Friend {

    String name;
    String profession;
    String nationality;
    int age;

    public Friend() {

    }
    public Friend (String name, String profession, String nationality, int age){
        this.name = name;
        this.profession = profession;
        this.nationality = nationality;
        this.age = age;

    }

    public void learnGerman(){
        System.out.println("learnGerman");
    }
    public void playSport(){
        System.out.println("playSport");
    }
    public void party(){
        System.out.println("party");
    }
    public void tellMeAboutYourself(){
        System.out.printf("My name is %s, I'm %d years old, I'm from %s, I'm working as a %s.\n" , name , age , nationality, profession);
    }

}

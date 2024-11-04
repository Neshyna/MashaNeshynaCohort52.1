package hw15_Neshyna_cohort52_1;

public class Husband {

    String name;
    String profession;
    String nationality;
    int age;

    public Husband() {

    }
    public Husband (String name, String profession, String nationality, int age){
        this.name = name;
        this.profession = profession;
        this.nationality = nationality;
        this.age = age;

    }

    public void work(){
        System.out.println("work");
    }
    public void playDOTA(){
        System.out.println("playDOTA");
    }
    public void keepCalmAndPayBills(){
        System.out.println("keepCalmAndPayBills");
    }
    public void tellMeAboutYourself(){
        System.out.printf("My name is %s, I'm %d years old, I'm from %s, I'm working as a %s.\n" , name , age , nationality, profession);
    }

}

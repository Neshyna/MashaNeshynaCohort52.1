package hw15_Neshyna_cohort52_1;

public class Mother {

    String status;
    String hobby;
    int height;
    int weight;

    public Mother() {

    }
    public Mother (String status, String hobby, int weight, int height){
        this.status = status;
        this.hobby = hobby;
        this.height = height;
        this.weight = weight;

    }

    public void watchKids(){
        System.out.println("watchKids");
    }
    public void cooking(){
        System.out.println("cooking");
    }
    public void shopping(){
        System.out.println("shopping");
    }
    public void tellMeAboutYourself(){
        System.out.printf("I'm %s, I like %s, I'm %d tall, I weight %d kg.\n" , status , hobby , height, weight);
    }


}

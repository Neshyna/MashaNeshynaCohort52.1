package hw15_Neshyna_cohort52_1;
/*
    Task 1
Посмотрите вокруг себя.
Напишите три класса, описывающие какие-то сущности вокруг Вас.

Не забудьте использовать абстракцию.

Например, опишите студента, преподавателя и, допустим, врача.

Вы можете выбрать свои сущности для описания.
     */

public class HW15_Task1_Neshyna_cohort52_1 {
    public static void main(String[] args) {

        Husband husband = new Husband();

        System.out.println("The husband does each day: ");
        husband.keepCalmAndPayBills();
        husband.playDOTA();
        husband.work();

        Husband husband1 = new Husband("Cha Eun-woo","Actor", "South Korea", 27);
        husband1.tellMeAboutYourself();


        Mother mother = new Mother();

        System.out.println("What skills mom has: ");
        mother.cooking();
        mother.watchKids();
        mother.shopping();


        Mother mother1 = new Mother( "married", "watching youtude and serials", 50, 170 );
        mother1.tellMeAboutYourself();


        Friend friend = new Friend();

        System.out.println("My friend is busy with: ");
        friend.party();
        friend.learnGerman();
        friend.playSport();

        Friend friend1 = new Friend("Stefania","Doctor","Venezuela", 28);
        friend1.tellMeAboutYourself();





    }

}

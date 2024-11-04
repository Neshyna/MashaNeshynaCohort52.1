package lesson17;

public class PersonApp {
    public static void main(String[] args) {

        Person harry = new Person("Harry", 31, "Photo");
        System.out.println(harry.toString());

        Person john = new Person("John", 75, "Music");
        System.out.println(john.toString());

        Person [] people = new Person[5];
        people[0] = harry;
        people[3] = john;
        people[1] = new Person("Tom", 5, "game");
        System.out.println(people[0].toString());
        System.out.println("people 0  get name: " + people[0].getName());

        people[0].setName("Peter");
        System.out.println(people[0].toString());
        System.out.println(harry.toString());



        System.out.println("\n ======================== For ============= \n");

        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println(people[i].toString());
                System.out.println("peoples[i].getName(): " + people[i].getName());
            } else {
                System.out.println("Null!!!");
            }
        }

        System.out.println("==========================\n");
        Person test = new Person("Test", 50, "coding");
        people[2] = test;

        people[2].setName("Test1");
        test.setAge(52);
        System.out.println(test.toString());

        test = null;
        System.out.println("peoples[2].getHobby(): " + people[2].getHobby());

        test = people[1];


    }

}

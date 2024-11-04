package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Scanner;

public class Task1_HW7_Neshyna_cohort52_1_18Sept {

    /*        Task 1
Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
     */

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println(" Type number 1 or 2 or 3:");
    int number = scanner.nextInt();
    // reads first input token when we insert f.ex. 1 2 3 together
    scanner.nextLine();
    // next line command is must have when int or double variables are used when string -  not

        if (number == 1) {
            System.out.println("'one' is inserted");
        }
        else if (number == 2) {
            System.out.println("'two' is inserted");
        }
        else if (number == 3) {
            System.out.println("'three' is inserted");
        }
        else {
            System.out.println("not correct");
        }

}
}

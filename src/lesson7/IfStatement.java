package lesson7;

import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        int y = 125;
        if (y > 11) System.out.println("Hallo zusammen!");
        //if true, then print. when false, print nothing


        int b = 8;
        if (b > 11) System.out.println("chick chick boom");
        //print nothing



        int a = 8;
        if (a > 11){
            System.out.println("if block");
            System.out.println("a = :" + a);
            //code block used {}
        }
        else if (a > 7){
            System.out.println("I'm in 'if else' block");
        }
        else {
            System.out.println("Else block");
        }


        System.out.println("================");

        Scanner scanner = new Scanner(System.in);
        System.out.println(" insert number 1 or 10:");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("1 is inserted");
        }
        else if (number == 10) {
            System.out.println("10 is inserted");
        }
        else {
            System.out.println("not correct inserted");
        }

        System.out.println("=================");
        //find min from several numerals
        Random random = new Random();

        int v1 = random.nextInt(50);
        int v2 = random.nextInt(50);
        int v3 = random.nextInt(50);

        System.out.println(v1 + " | " + v2 + " | " + v3);

        int min = v1;
        if (v2< min) {
            min = v2;
        }
        if(v3 < min) min = v3;

        System.out.println("min" + min);
        //replace min value when find new min value


    }
}

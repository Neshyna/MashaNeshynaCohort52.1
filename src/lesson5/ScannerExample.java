package lesson5;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //insert data from keyboard
        System.out.println("Type your name:");
        String name = scanner.nextLine();
        System.out.println("name:" + name);

        System.out.println("Your age?: ");
        int age = scanner.nextInt();//get numerals int type
        System.out.println("age:" + age);
        scanner.nextLine();//cut the rest

        System.out.println("Your height?:");
        double leheight = scanner.nextDouble();
        System.out.println("Height:" + leheight);
        //int height = scanner.nextLine();// cut the rest of the line


    }
}

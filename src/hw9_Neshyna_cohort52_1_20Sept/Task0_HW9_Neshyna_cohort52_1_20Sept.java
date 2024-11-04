package hw9_Neshyna_cohort52_1_20Sept;

import java.util.Scanner;

public class Task0_HW9_Neshyna_cohort52_1_20Sept {
    /*
    Task 0
Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.

Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
     */

    public static void main(String[] args) {

        printStingLength(scannedString());
    }
    //method body
    public static String scannedString(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Type anything:");
        String stingInserted = scanner.nextLine();
        System.out.println("stringInserted:" + stingInserted);

        int stringLength = stingInserted.length();
        return stingInserted;

        }
    public static void printStingLength(String string){

        System.out.println("String length:" + string.length() );
    }
}

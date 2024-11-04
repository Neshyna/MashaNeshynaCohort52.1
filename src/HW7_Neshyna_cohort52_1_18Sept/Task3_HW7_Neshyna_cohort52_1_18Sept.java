package HW7_Neshyna_cohort52_1_18Sept;

import java.util.Scanner;

public class Task3_HW7_Neshyna_cohort52_1_18Sept {
/*
Task 3 (Повышенной сложности, опционально)
Программа предлагает пользователю ввести четырехзначное число.
Ввод осуществляется только в формате строки (String).
Если введенное значение не является четырехзначным числом, должно выводиться сообщение об ошибке, и программа завершает работу.
Проверить, является ли число "счастливым билетом". Для этого нужно сравнить сумму первых двух цифр с суммой последних двух цифр.
Примеры:

Число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое.
Число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым.
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type four-digit number:");
        String fourDigitNumber = scanner.nextLine();

        int numberLength = fourDigitNumber.length();

        if (numberLength == 4) {

            char a = fourDigitNumber.charAt(0);//1st number
            char b = fourDigitNumber.charAt(1);//2nd number
            char c = fourDigitNumber.charAt(2);//3d number
            char d = fourDigitNumber.charAt(3);//4th number

            // Добавить проверку каждого символа, что он является цифрой
            if (fourDigitNumber.charAt(0) < 48 || fourDigitNumber.charAt(0) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }
            if (fourDigitNumber.charAt(1) < 48 || fourDigitNumber.charAt(1) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }

            if (fourDigitNumber.charAt(2) < 48 || fourDigitNumber.charAt(2) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }

            if (fourDigitNumber.charAt(3) < 48 || fourDigitNumber.charAt(3) > 57) {
                System.out.println("Все пропало. Символ не является цифрой");
                System.exit(0);
            }

            System.out.println("correct." + fourDigitNumber + " is a four-digit number.");

            if ((a+b) == (c+d)) {
                System.out.println("Lucky Ticket");
            }
            else {
                System.out.println("Not Lucky Ticket");
            }
        }
            else {
            System.out.println("error." + fourDigitNumber + " is not a four-digit number.");
        }




        // Option 2
        if (fourDigitNumber.length() == 4) {
            //Код обработки строки
            int input = Integer.parseInt(fourDigitNumber);// конвертация строки в число
        //  System.out.println("input: " + input);

            // 1234 этой операцией я записываю последнюю цифру в digit0
            int digit0 = input % 10;
            input = input / 10;

            // 123
            int digit1 = input % 10;
            input = input / 10;

            // 12
            int digit2 = input % 10;
            int digit3 = input / 10;

            System.out.printf("Числа %d, %d, %d, %d\n", digit0, digit1, digit2, digit3);

            if (digit0 + digit1 == digit2 + digit3) {
                System.out.println("Вариант 2. Число счастливое");
            } else {
                System.out.println("Не счастливое");
            }




        } else {
            System.out.println("Длина строки не 4 символа");
        }






    }
}


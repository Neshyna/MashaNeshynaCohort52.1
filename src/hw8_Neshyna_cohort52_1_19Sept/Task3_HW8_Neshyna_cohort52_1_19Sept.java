package hw8_Neshyna_cohort52_1_19Sept;

public class Task3_HW8_Neshyna_cohort52_1_19Sept {
    /*
    Task 3
Используйте цикл while для решения задачи:
Распечатайте все числа от 1 до 100, которые делятся на 5 без остатка.
Task 3.1 * (Опционально)
Распечатайте первые 7 чисел от 1 до 100, которые делятся на 5 без остатка.
     */
    public static void main(String[] args) {

        int numbers = 1;
        int count = 0;

        System.out.println( "Numerals divide 5:" );
        while (numbers <= 100 && count < 7) { //вывести первые 7 значений

            if (numbers % 5 == 0) {
                System.out.print( numbers +  " ; ");// в одну строку
                count++;
                numbers +=5;// пересчитывает сразу кратные 5. каждое от 1 ...100 считает в else

            }
            else {
            numbers++;
            }

                    }


                }
}

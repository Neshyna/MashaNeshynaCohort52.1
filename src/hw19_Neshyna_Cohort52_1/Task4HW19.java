package hw19_Neshyna_Cohort52_1;
/*
Task4 * (Опционально)
Final параметр метода
•	Напишите метод printMessage(final String message), который выводит сообщение на экран.
•	Попробуйте изменить значение параметра message внутри метода.
•	Объясните результат и поведение компилятора.
 */
public class Task4HW19 {

    final String message = "message";

    public void printMessage() {

        //message = "change message";
        // cannot assign value to final variable
        //error can be eliminated only if change value not to final

        System.out.println(message);

    }

}
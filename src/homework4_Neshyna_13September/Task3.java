package homework4_Neshyna_13September;

public class Task3 {

    //author: Masha Neshyna
    //date: 13/09/2024

    /*
    Task 3 * (Опционально)
Потеря данных при преобразовании
Напишите программу, которая:

Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
Обратите внимание на полученный результат и подумайте, почему он отличается от ожидаемого.


Answer: During casting from long into int bites are lost. But when I use double -> int, it's casting correctly.
     */
    public static void main(String[] args) {


        long bigNumber = 15_000_000_000L; // "L" is obligatory, doesn't work without "L"

        int smallNumber = (int) bigNumber;

        System.out.println("smallNumber:" + smallNumber);

    }}


        /*byte b1 = 127;
        b1 = b1 + 1;
        b1++;//b1=b1+1;
// result -128  преполнение типа
        System.out.println(b1);
*/


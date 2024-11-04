package hw17_Neshyna_cohort52_1;
/*
Task 2 * (Опционально)
Написать метод lastIndexOf(int value) возвращающий индекс последнего вхождения значения в массиве.
 */
// Метод поиска по значению. Поиск последнего вхождения
// {1, 100, 5, 5, 100} -> 100 метод вернет индекс последнего найдено вхождения = 4

public class Task2LastIndexOf{

    int cursor;
    int[] array;

    int lastIndexOf(int value) {

        for(int i = cursor -1; i >= 0 ;  i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}


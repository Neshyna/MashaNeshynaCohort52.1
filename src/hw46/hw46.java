package hw46;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class hw46 {
    /*
    Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate
и возвращающий количество дней между самой ранней и поздней датами в этом списке
     */

    private static List<LocalDate> dates = new LinkedList<>();

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now(); //
        System.out.println("current date: " + currentDate);

        System.out.println("year: " + currentDate.getYear() + "; month: " + currentDate.getMonth() + "; day: " + currentDate.getDayOfMonth());

        LocalDate birthDay = LocalDate.of(1993, Month.JULY, 13);
        System.out.println("birthDay: " + birthDay);

        LocalDate dateToCompare = LocalDate.of(1989, Month.APRIL, 18);

        //compare dates
        if (birthDay.isAfter(dateToCompare)){
            System.out.println(birthDay + " isAfter " + dateToCompare);
        }

        if (dateToCompare.isBefore(birthDay)){
            System.out.println(dateToCompare + " isBefore " + birthDay);
        }

        if (birthDay.isEqual(dateToCompare)){
            System.out.println("dates are equal");
        }else{
            System.out.println("dates are not equal");
        }

        LocalTime currentTime = LocalTime.now();
        System.out.println("current time: " + currentTime);

        LocalTime currentTimePlus3Hours = currentTime.plusHours(3);
        System.out.println("currentTimePlus3Hours: " + currentTimePlus3Hours);

        LocalDate dateWeekLater = currentDate.plusWeeks(1);
        System.out.println("dateWeekLater: " + dateWeekLater);

        LocalDate yearEarlier = currentDate.minusYears(1);
        System.out.println("yearEarlier: " + yearEarlier);

        LocalDate yearLater = currentDate.plusYears(1);
        System.out.println("yearLater: " + yearLater);

        LocalDate tomorrow = currentDate.plusDays(1);
        LocalDate yesterday = currentDate.minusDays(1);
        if (tomorrow.isAfter(currentDate)){
            System.out.println("tomorrow.isAfter(currentDate): " + tomorrow.isAfter(currentDate));;
        }
        if (yesterday.isBefore(currentDate)){
            System.out.println("yesterday.isBefore(currentDate): " + yesterday.isBefore(currentDate));;
        }

        List<LocalDate> dates = new ArrayList<>();
        dates.add(currentDate);
        dates.add(birthDay);
        dates.add(dateToCompare);

        long daysBetween = task2(dates);
        System.out.println(daysBetween);

    }

    public static long task2(List<LocalDate> dates){

        List<LocalDate> days = dates;
        days.stream()
                .sorted()
                .collect(Collectors.toList());

        LocalDate day1 = days.get(0);
        LocalDate day2 = days.get(days.size() - 1);

        long daysBetween = day1.until(day2,ChronoUnit.DAYS);

        return daysBetween;

    }

}

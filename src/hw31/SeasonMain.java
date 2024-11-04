package hw31;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами, возвращающими среднюю температуру для каждого времени года.
 */
public class SeasonMain {

    public static void main(String[] args) {

        for (EnumSeason season : EnumSeason.values()){
            System.out.println(season.seasonMethod());
        }
    }
}

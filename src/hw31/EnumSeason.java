package hw31;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */
public enum EnumSeason {

    SUMMER(25.3),
    AUTUMN(12.4),
    WINTER(4.9),
    SPRING(16.7);

    private final double averageTemterature;

    EnumSeason(double averageTemterature) {
        this.averageTemterature = averageTemterature;
    }

    public double getAverageTemterature() {
        return averageTemterature;
    }

    public String seasonMethod() {
        return "season: " + this.name() +
        ", average temperature: " + this.averageTemterature;
    }


}

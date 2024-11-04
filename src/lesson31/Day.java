package lesson31;

public enum Day {
    MONDAY("ponedelnik",1),
    TUESDAY("vtornik", 2),
    WEDNESDAY("sreda",3),
    THURSDAY("chetverg", 4),
    FRIDAY("piatniza", 5),
    SATURDAY("subbota", 6),
    SUNDAY("voskresenie", 7);

    private String russian;
    private int dayOfWeek;

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }

    public String getRussian() {
        return russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }
    public String testMethod(){
        return String.format("%s - russian translation: %s, number weekday: %d",
                this.name(),this.russian,this.dayOfWeek);
    }

}

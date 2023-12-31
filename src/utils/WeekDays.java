package utils;

public enum WeekDays {
    PONIEDZIALEK("Poniedziałek"),
    WTOREK("Wtorek"),
    SRODA("środa"),
    CZWARTEK("Czwartek"),
    PIATEK("Piątek"),
    SOBOTA("Sobota"),
    NIEDZIELA("Niedziela");

    private String name;

    WeekDays(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

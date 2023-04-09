package lesson3.weekdays;

import java.time.temporal.WeekFields;
import java.util.Arrays;

public enum WeekDays {
    //создайте перечисление дней недели
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;


    //возвращат true усли день с пн по пт включительно
    public boolean isWorkDay() {
        switch (this) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                return true;
            default:
                return false;
        }
    }

    //возвращать true если день сб или вс

    public boolean isWeekEnd() {
        switch (this) {
            case SATURDAY:
            case SUNDAY:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal()); //орядковый номер
        System.out.println(
                Arrays.toString(
                        WeekDays.values()
                )
        );

        WeekDays day = WeekDays.FRIDAY;
        WeekDays day1 = WeekDays.valueOf("WEDNESDAY");
        //day = WeekDays.valueOf("HELLO"); //этого значения нет, потому будет иксепшн и программа выйдет

        System.out.println(WeekDays.valueOf("WEDNESDAY").ordinal()); //порядковый номер

        System.out.println("Is Monday working day? - " + WeekDays.MONDAY.isWorkDay());
        System.out.println("Is Wednesday weekend day? - " + WeekDays.WEDNESDAY.isWeekEnd());
        System.out.println("Is Sunday working day? - " + WeekDays.SUNDAY.isWorkDay());
        System.out.println("Is Saturday weekend day? - " + WeekDays.SATURDAY.isWeekEnd());
    }
}

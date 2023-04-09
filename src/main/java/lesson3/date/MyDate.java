package lesson3.date;

import java.time.LocalDate;

enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int number;

    Month(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

// можно сделать month через enum
//добавьте конструкторы, геттеры и сеттеры
public class MyDate {
    private int year, day;
    private Month month;

    private LocalDate date;

    public MyDate(int day, Month month, int year) {
        this.year = year;
        this.day = day;
        this.month = month;
        this.date = LocalDate.of(year, month.getNumber(), day);
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    //добавьте функцию (обратить внимание на высокосны год)
    //добавить дни к дате
    public void add(int days) {
        date = date.plusDays(days);
        this.day = date.getDayOfMonth();
        this.month = Month.valueOf(date.getMonth().name());
        this.year = date.getYear();
    }

    @Override
    public String toString() {
        return "The date is : " +
                day + " " +
                month + " " +
                year;
    }
}

class Test {
    public static void main(String[] args) {
        MyDate myDate = new MyDate(1, Month.JANUARY, 2023);
        myDate.add(135);
        System.out.println(myDate);

        myDate = new MyDate(28, Month.FEBRUARY, 2020);
        myDate.add(1);
        System.out.println(myDate);
    }
}

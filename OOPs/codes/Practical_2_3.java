package OOPs.codes;

/*
Practical No: 2.3
Title: Time Class

Practical Statement:
Design a class Time with hours and minutes as data members.
Implement methods setTime(), displayTime(), and addTime() to add two Time objects.
Do not use constructors for initialization.
*/

class Time {

    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void addTime(Time t1, Time t2) {

        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60) {
            hours = hours + (minutes / 60) ; // add to hours
            minutes = minutes % 60; // remaing minutus
        }
    }

    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }
}

public class Practical_2_3 {

    public static void main(String[] args) {

        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(2, 45);
        t2.setTime(3, 30);

        result.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Result: ");
        result.displayTime();
    }
}
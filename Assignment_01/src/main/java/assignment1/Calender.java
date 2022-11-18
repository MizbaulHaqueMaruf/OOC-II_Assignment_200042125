package assignment1;

public class Calender {
    public String nextDay(int day, int month, int year) {
        if (isEndOf31DaysMonth(day, month)) {
            day = 1;
            month++;
        }
        else if (isEndOf30DaysMonth(day, month)){
            day = 1;
            month++;
        }
        else if (isEndOfYear(day, month)) {
            day = 1;
            month = 1;
            year++;
        }
        else if (isFebruary(month)) {
            if (isLeapYear(day, month, year)) {
                if (day == 29) {
                    day = 1;
                    month++;
                }
                else {
                    day = day + 1;
                }
            }
            else {
                if (day == 28) {
                    day = 1;
                    month++;
                }
            }
        }
        else {
            day = day + 1;
        }

        String next = day + "-" + month + "-" + year;
        return next;
    }

    public boolean isEndOf31DaysMonth(int day, int month) {
        if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && day == 31) {
            return true;
        }
        return false;
    }

    public boolean isEndOf30DaysMonth(int day, int month) {
        if ((month == 4 || month == 6 || month == 9 || month == 11) && day == 30) {
            return true;
        }
        return false;
    }

    public boolean isEndOfYear(int day, int month){
        if ((month == 12) && day == 31){
            return true;
        }
        return false;
    }

    public boolean isFebruary(int month){
        if ((month == 2))
            return true;
        else
            return false;
    }

    public boolean isLeapYear(int day, int month, int year){
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return true;
        else
            return false;
    }
}

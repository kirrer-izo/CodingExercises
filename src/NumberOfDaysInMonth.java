public class NumberOfDaysInMonth {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
            return false;
        }
        boolean isDivisibleByFour = (year % 4) == 0;
        boolean isDivisibleByHundred = (year % 100) == 0;
        boolean isDivisibleByFourHundred = (year % 400) == 0;

        if (isDivisibleByFour &&  !isDivisibleByHundred) {
            return true;
        } else if (isDivisibleByFourHundred) {
            return true;
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year){
        int days  = -1;
        if (month < 1 || month > 12){
            return days;
        }
        if (year < 1 || year > 9999){
            return days;
        }
        boolean isLeapYear = isLeapYear(year);

        switch (month) {
            case 9, 4, 6, 11 -> days = 30;
            case 1, 3, 5, 7, 8, 10, 12 -> days = 31;
            case 2 -> {
                if(isLeapYear){
                    days = 29;
                } else {
                    days = 28;
                }

            }

        };
        return days;
//
    }
}
public class LeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(10000));
        System.out.println(isLeapYear(1924));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));

    }
    public static boolean isLeapYear (int year) {
        if (year < 10000 && year > 0) {
        int remainderMod4 = year % 4;
        int remainderMod100 = year % 100;
        int remainderMod400 = year % 400;

       if (remainderMod4 == 0 && remainderMod100 != 0) {
           return true;
       } else if (remainderMod100 == 0 && remainderMod400 == 0) {
           return true;
       }
        }
        return  false;

    }

}

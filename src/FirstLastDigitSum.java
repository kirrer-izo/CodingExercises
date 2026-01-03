public class FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));

        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;

//        int reverse = 0;
//        while (number > 0) {
//            int lastDigit = number % 10;
//            if (reverse == 0) {
//                reverse = lastDigit;
//            } else {
//                reverse = (reverse * 10) + lastDigit;
//            }
//            number = number / 10;
//        }
//
//        int firstDigit = reverse % 10;

        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

        return firstDigit + lastDigit;
    }
}

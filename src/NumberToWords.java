public class NumberToWords {

    public static void main(String[] args) {

        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(123));
//        System.out.println(getDigitCount(-12));
//        System.out.println(getDigitCount(5200));

//        System.out.println(reverse(-121));
//        System.out.println(reverse(1212));
//        System.out.println(reverse(1234));
//        System.out.println(reverse(100));

//        numberToWords(123);
        numberToWords(0);
//        numberToWords(1000);
//        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        int originalNumber = number;
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        number = reverse(number);

            int diffCount = getDigitCount(originalNumber) - getDigitCount(number);

        while (number > 0) {
            int lastDigit = number % 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            };
            number /= 10;
        }
        if (diffCount != 0) {

            for (int i = 0; i < diffCount; i++) {

            System.out.println("Zero");
            }
        }
    }
    public static int reverse (int number) {
        int originalNumber = number;
        if (number < 0) {
            number *= -1;
        }
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            if (reverse == 0) {
                reverse = lastDigit;
            } else {
                reverse = (reverse * 10) + lastDigit;
            }
            number = number / 10;
        }
        if (originalNumber < 0) {
            reverse *= -1;
        }

        return reverse;
    }

    public static int getDigitCount (int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int digitCount = 0;

        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        return digitCount;

    }
}

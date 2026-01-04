public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrim(21));
        System.out.println(getLargestPrim(217));
        System.out.println(getLargestPrim(0));
        System.out.println(getLargestPrim(45));
        System.out.println(getLargestPrim(-1));
    }

    public static int getLargestPrim(int number) {
        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;

        for(int i = 2 ; i <= number; i++) {
            int j = 1;
            if(number % i == 0 && number > largestPrime) {
                largestPrime = i;
                number /= i;
                i--;
            }
        }

        return largestPrime;


    }
}

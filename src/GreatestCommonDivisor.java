public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int largest = 0;
        int gcd = 0;
        if (first > second) {
            largest = first;
        } else if (second > first) {
            largest = second;
        }

        for (int i = 1; i <= largest; i++) {

            if(first % i == 0 && second % i == 0) {
                gcd = i;
            }
        }
        return gcd;

    }
}

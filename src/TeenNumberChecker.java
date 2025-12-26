public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
    public static boolean hasTeen (int age1, int age2, int age3) {
        boolean hasTeen;
        if (age1 <= 19 && age1 >= 13 || age2 <= 19 && age2 >= 13 || age3 <= 19 && age3 >= 13) {
            return hasTeen = true;
        } else {
            return hasTeen = false;
        }
    }
    public static boolean isTeen (int age) {
            return age <= 19 && age >= 13;

    }
}

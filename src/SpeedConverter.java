public class SpeedConverter {

    public static void main(String[] args) {

        long result = toMilesPerHour(1.5);
        System.out.println(result);
        printConversion(1.5);

    }
        public static long toMilesPerHour(double kilometersPerHour) {

            if (kilometersPerHour >= 0) {
                double result = kilometersPerHour / 1.609d;
                return Math.round(result);
            } else {
                return -1L;
            }
        }

        public static void printConversion(double kilometersPerHour) {
            double result;
            result = toMilesPerHour(kilometersPerHour);
            if (result!=-1L) {
                System.out.println(kilometersPerHour + " km/h = " + Math.round(result) + " mi/h");
            } else {
                System.out.println("Invalid Value");
            }
        }
}

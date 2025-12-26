public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123,3.123));

    }
    public static boolean areEqualByThreeDecimalPlaces (double value1, double value2) {
//        if (value1 > 0 && value2 > 0) {
//            value1 = Math.floor(value1 * 1000.0) / 1000.0;
//            value2 = Math.floor(value2 * 1000.0) / 1000.0;
//        } else if (value1 > 0 && value2 < 0) {
//            value1 = Math.floor(value1 * 1000.0) / 1000.0;
//            value2 = Math.ceil(value2 * 1000.0) / 1000.0;
//        } else if (value1 < 0 && value2 > 0) {
//            value1 = Math.ceil(value1 * 1000.0) / 1000.0;
//            value2 = Math.floor(value2 * 1000.0) / 1000.0;
//        } else if (value1 < 0 && value2 <0) {
//            value1 = Math.ceil(value1 * 1000.0) / 1000.0;
//            value2 = Math.ceil(value2 * 1000.0) / 1000.0;
//        }
//        double result = value1 / value2;
//        return result == 1 || value1 == 0 && value2 == 0;
    //}
        boolean isEqualByThreeDecimalPlaces;
            if ( (long)(value1*1000) == (long)(value2*1000) ) {
                return isEqualByThreeDecimalPlaces = true;
            } else {
                return isEqualByThreeDecimalPlaces = false;
            }

//            return isEqualByThreeDecimalPlaces;
}
}

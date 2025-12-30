public class NumberInWord {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(-9);
        printNumberInWord(80);
    }
    public static void printNumberInWord(int number) {

        String numberWord = "OTHER";

        switch (number) {
            case 0 -> numberWord = "ZERO";
            case 1 -> numberWord = "ONE";
            case 2 -> numberWord = "TWO";
            case 3 -> numberWord = "THREE";
            case 4 -> numberWord = "FOUR";
            case 5 -> numberWord = "FIVE";
            case 6 -> numberWord = "SIX";
            case 7 -> numberWord = "SEVEN";
            case 8 -> numberWord = "EIGHT";
            case 9 -> numberWord = "NINE";
        }
        System.out.println(numberWord);
    }
}

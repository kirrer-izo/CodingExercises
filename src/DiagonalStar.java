public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.print("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                boolean isFirstRowOrCOlumn = row == 1 || column == 1;
                boolean isLastRowOrColumn = row == number || column ==number;
                boolean isDiagonal = (row == column) || (column == (number - row + 1));

                if (isFirstRowOrCOlumn || isLastRowOrColumn || isDiagonal) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    }


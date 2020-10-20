public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            System.out.println();
            System.out.println();
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        printSquareStar(9);
        printSquareStar(8);
    }

}

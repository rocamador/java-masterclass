public class IntEqualityPrinter {

    public static void main(String[] args) {

        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int i, int i1, int i2) {
        if (i < 0 || i1 < 0 || i2 < 0) {
            System.out.println("Invalid Value");
        } else if (i == i1 && i == i2) {
            System.out.println("All numbers are equal");
        } else if (i != i1 && i != i2 && i1 != i2) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10)
            return -1;

        int max = 0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0 && second % i == 0 && i > max) {
                max = i;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("res=" + getGreatestCommonDivisor(12,30));
        System.out.println("res=" + getGreatestCommonDivisor(25,15));
        System.out.println("res=" + getGreatestCommonDivisor(12,30));
        System.out.println("res=" + getGreatestCommonDivisor(9,18));
        System.out.println("res=" + getGreatestCommonDivisor(81,153));
    }



}

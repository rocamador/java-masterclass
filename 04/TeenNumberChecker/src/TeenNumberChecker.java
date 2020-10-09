public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int i1, int i2, int i3) {
        int[] i = { i1, i2, i3 };
        for (int k : i) {
            if (isTeen(k))
                return true;
        }
        return false;
    }

    public static boolean isTeen(int k) {
        return k >= 13 && k <= 19;
    }
}

public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b ) {
        if (a < 10 || a > 99 || b < 10 || b > 99)
        return false;

        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);

        for ( char c : aStr.toCharArray()) {
            if (bStr.contains( "" + c ))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

}

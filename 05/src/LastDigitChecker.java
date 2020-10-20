public class LastDigitChecker {

    public static boolean isValid(int a) {
        return a >= 10 && a <= 1000;
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (!isValid(a) || !isValid(b) || !isValid(c))
            return false;

        String aStr = Integer.toString(a);
        String bStr = Integer.toString(b);
        String cStr = Integer.toString(c);

        char aLastDigit = aStr.charAt(aStr.length()-1);
        char bLastDigit = bStr.charAt(bStr.length()-1);
        char cLastDigit = cStr.charAt(cStr.length()-1);

        return (aLastDigit == bLastDigit) || (bLastDigit == cLastDigit) || (aLastDigit == cLastDigit);
    }

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }

}

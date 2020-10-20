public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0)
            return -1;

        String numStr = Integer.toString(number);

        int first = -1;
        int last = -1;
        for ( char c : numStr.toCharArray()) {
            if (first == -1)
                first = c - '0';
            last = c - '0';
        }
        return first+last;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

}

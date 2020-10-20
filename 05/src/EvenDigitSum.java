public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0)
            return -1;

        String numStr = Integer.toString(number);

        int sum = 0;
        for ( char c : numStr.toCharArray()) {
            int num = c - '0';
            if (num % 2 == 0) {
                //System.out.printf("sum=%s (%s)", sum, num);
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

}

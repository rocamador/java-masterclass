public class NumberToWords {

    public static int reverse(int i) {
        int rev = 0;
        while(i != 0) {
            int digit = i % 10;
            rev = rev * 10 + digit;
            i /= 10;
        }
        return rev;
    }

    public static int getDigitCount(int number) {
        if (number < 0 )
            return -1;
        return Integer.toString(number).length();
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int size = getDigitCount(number);

        number = reverse(number);

        StringBuilder sb = new StringBuilder();
        int digit_cnt = 0;
        while (number > 0) {
            int digit = number % 10;
            switch(digit) {
                case 0:
                    sb.append("Zero");
                    break;
                case 1:
                    sb.append("One");
                    break;
                case 2:
                    sb.append("Two");
                    break;
                case 3:
                    sb.append("Three");
                    break;
                case 4:
                    sb.append("Four");
                    break;
                case 5:
                    sb.append("Five");
                    break;
                case 6:
                    sb.append("Six");
                    break;
                case 7:
                    sb.append("Seven");
                    break;
                case 8:
                    sb.append("Eight");
                    break;
                case 9:
                    sb.append("Nine");
                    break;
                default:
                    break;
            }
            sb.append(" ");
            number = number / 10;
            digit_cnt++;
        }

        for (int i = digit_cnt; i < size; i++) {
            sb.append("Zero").append(" ");
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }


}

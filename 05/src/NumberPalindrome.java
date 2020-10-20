public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        StringBuilder reverseStr;
        if (number >= 0)
            reverseStr = new StringBuilder(Integer.toString(number)).reverse();
        else {
            reverseStr = new StringBuilder(Integer.toString(Math.abs(number))).reverse();
            reverseStr.insert(0,"-");
        }
        return reverseStr.toString().equals(Integer.toString(number));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

}

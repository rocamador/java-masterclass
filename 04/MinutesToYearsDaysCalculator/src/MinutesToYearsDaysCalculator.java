public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = minutes/60/24/365;
        long days = (minutes/60/24) % 365;

        System.out.printf("%s min = %s y and %s d\n", minutes, years, days);

    }
}

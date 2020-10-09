import static java.lang.Math.round;

public class SpeedConverter {

    private static final double MILE_TO_KILOMETER = 1.609;

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            return -1;
        return round(kilometersPerHour/MILE_TO_KILOMETER);
    }

    private static void printConversion(double v) {
        if (v<0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.printf("%s km/h = %s mi/h\n", v, toMilesPerHour(v));
    }

}

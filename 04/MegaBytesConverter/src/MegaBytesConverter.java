import static java.lang.Math.round;

public class MegaBytesConverter {

    private static final int BYTE = 1024;

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int i) {
        if (i<0) {
            System.out.println("Invalid Value");
            return;
        }
        int mega = round(i/BYTE);
        int kb = i - mega*BYTE;
        System.out.printf("%s KB = %s MB and %s KB\n", i, mega, kb);

    }


}

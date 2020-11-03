import org.rocamador.math.Series;

public class SeriesMain {
    public static void main(String[] args) {
        for (int i =0; i<= 10; i++) {
            System.out.println("i: " + i + " --> " + Series.nSum(i));
        }

        for (int i =0; i<= 10; i++) {
            System.out.println("i: " + i + " --> " + Series.factorial(i));
        }

        for (int i =0; i<= 10; i++) {
            System.out.println("i: " + i + " --> " + Series.fibonacci(i));
        }
    }
}

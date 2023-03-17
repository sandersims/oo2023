import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static double kiirus(double kiirus1, double kiirus2) {
        double keskmineKiirus = (kiirus1 + kiirus2) / 2;
        return keskmineKiirus;
    }

    public static double koguKeskmineKiirus(ArrayList<Double> kiirused) {
        double summa = 0.0;
        for (double kiirus : kiirused) {
            summa += kiirus;
        }
        double keskmine = summa / kiirused.size();
        return keskmine;
    }

    ArrayList<Double> kiirused = new ArrayList<>(Arrays.asList(60.0, 50.0, 55.0, 65.0));
    double keskmine = koguKeskmineKiirus(kiirused);
    System.out.println("Kogu selle tee läbimise keskmine kiirus: " + keskmine + " km/h");
}
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(kiirus(15, 45));
        ArrayList<Double> kiirused = new ArrayList<>(Arrays.asList(47.0, 53.0, 80.0, 120.0));
        System.out.println(koguKeskmineKiirus(kiirused));
        ArrayList<Double> kiirusedFailist = new ArrayList<>();
        System.out.println("Kõikide keskmine on: " + failiKeskmine(kiirusedFailist) + " ja see kirjutati keskmisedKiirused faili");
    }
    public static double kiirus(double kiirus1, double kiirus2) {
        return (kiirus1 + kiirus2) / 2;
    }

    double kiirus1 = 15.0;
    double kiirus2 = 45.0;
    double lihtsaltKeskmine = kiirus(kiirus1, kiirus2);
// System.out.println("Kahe kilomeetripikkuse lõigu läbimise keskmine kiirus on " + lihtsaltKeskmine + " km/h");


    public static double koguKeskmineKiirus(ArrayList<Double> kiirused) {
        double summa = 0.0;
        for (double kiirus : kiirused) {
            summa += kiirus;
        }
        return summa / kiirused.size();
    }

    public static double failiKeskmine(ArrayList<Double> kiirusedFailist) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("keskmisedKiirused.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                double number = Double.parseDouble(line);
                kiirusedFailist.add(number);
            }
            br.close();
        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        double koikKeskmised = 0;
        for (Double aDouble : kiirusedFailist) {
            koikKeskmised += aDouble;
        }
        double koguKeskmine = koikKeskmised / kiirusedFailist.size();


        try {
            FileWriter writer = new FileWriter("koguKeskmine.txt");
            writer.write(Double.toString(koguKeskmine));
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        return koikKeskmised / kiirusedFailist.size();
    }
}
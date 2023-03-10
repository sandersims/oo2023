import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(aritmKeskmine(3,4,5));
        System.out.println(aritmKeskmine(5,5,5));

        double[] sisend = {3,4,5,6,6};
        System.out.println(Arrays.toString(libisevKeskmine(sisend)));

        LibisevKeskmine libisev = new LibisevKeskmine(2,3,4);
        libisev.lisanArv(4);
        System.out.println(libisev.arvudKeskmisega);
    }

    private static double aritmKeskmine(double arv1, double arv2, double arv3){
       return (arv1 + arv2 + arv3) / 3;
    }

    private static double[] libisevKeskmine(double[] arvud){
        double[] valjund = new double[arvud.length - 2];
        for (int i = 0; i < arvud.length-2; i++) {
            valjund[i] = (arvud[i] + arvud[i+1] + arvud[i+2]) / 3;
        }
        return valjund;
    }
}
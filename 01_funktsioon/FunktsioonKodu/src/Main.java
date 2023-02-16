public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int vahemaa = 100;
        int aeg = 2;
        System.out.println("Kui läbid " + vahemaa + "km " + aeg + " tunniga siis su kiirus on: " + kiiruseLeidmine(vahemaa, aeg) + "km/h");

        int raskus = 120;
        System.out.println( raskuseHinnang(raskus));

        int arv1 = 5;
        int arv2 = 7;
        System.out.println(arv1 + " * " + arv2 + " = " + korrutamine(arv1, arv2));
    }

    private static int korrutamine(int arv1, int arv2) {
        return arv1 * arv2;
    }

    private static String raskuseHinnang(int raskus) {
        String hinnang;
        if (raskus > 100) {
            hinnang = "Raske raskus";
        } else {
            hinnang = "Kerge raskus";
        }
        return hinnang;
    }

    private static double kiiruseLeidmine ( int vahemaa, int aeg){
        return (double) vahemaa / (double) aeg;
    }
}
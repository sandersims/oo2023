import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine {
//    double[] arvudListis;
//    double[] arvudKeskmisega;
//    int lisatudArvudeArv;
    List<Double> arvudListis = new ArrayList<>();
    List<Double> arvudKeskmisega = new ArrayList<>();
    public LibisevKeskmine(double arv1, double arv2, double arv3) {
//        arvudListis = new double[3];
//        arvudListis[0] = arv1;
//        arvudListis[1] = arv2;
//        arvudListis[2] = arv3;
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisanArv(double arv) {
        arvudListis.add(arv);
        for (int i = arvudKeskmisega.size(); i < arvudListis.size()-2; i++) {
            double keskmine = (arvudListis.get(i) + arvudListis.get(i+1) + arvudListis.get(i+2)) / 3;
            arvudKeskmisega.add(keskmine);
        }
    }
}

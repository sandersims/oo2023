import java.util.Date;

public class GymTime {
    String eesnimi;
    String perekonnanimi;
    String email;
    Date sisenemisaeg;
    Date v2ljumisaeg;

    public GymTime(String eesnimi, String perekonnanimi, String email) {
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.email = email;
        this.sisenemisaeg = new Date();
        this.v2ljumisaeg = null;
    }

    public String treeninguAlgus() {
        this.sisenemisaeg = new Date();
        return "Trenn algas!";
    }
    public String treeningulõpp() {
        this.v2ljumisaeg = new Date();
        return "Trenn läbi!";
    }
}

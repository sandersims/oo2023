public class Gym {
    Treener treener;
    int kylastajad;
    int kohtadeArv;

    public Gym(Treener treener, int kylastajad, int kohtadeArv) {
        this.treener = treener;
        this.kylastajad = kylastajad;
        this.kohtadeArv = kohtadeArv;
    }

    public String vabadkohad(){
        this.kohtadeArv = this.kohtadeArv - this.kylastajad;
        return "Hetkel on saalis " + kohtadeArv + " vaba kohta";
    }

    public String treenerperkylastaja(){
        return "Ühe treeneri kohta on saalis " + this.kylastajad/treener.mituTreenerit + " külastajat!";
    }
}

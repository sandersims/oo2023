public class Treener {
    String nimetus;
    int mituTreenerit;
    String asukoht;

    public Treener(String nimetus, int mituTreenerit, String asukoht) {
        this.nimetus = nimetus;
        this.mituTreenerit = mituTreenerit;
        this.asukoht = asukoht;
    }

    public void muudaAsukohta(String asukoht){
        this.asukoht = "Tartu";
    }

    public String kysiNimetust(){
        return nimetus;
    }
}

public class Mootorrattas extends S6iduk implements Andmed{
    public Mootorrattas(String mark, int kaal, int v6imsus, int hind) {
        super(mark, kaal, v6imsus, hind);
    }

    @Override
    public String getV6imsus() {
        float suhe = this.v6imsus / this.kaal;
        if (suhe > 0.2){
            return "Mootorrattas on väga võimas!";
        }   else{
            return "Mootorrattas on lahja!";
        }
    }

    @Override
    public String getHind() {
        if (this.hind > 15000){
            return "Mootorrattas on kallis!";
        }   else{
            return "Mootorratta hind on keskpärane!";
        }
    }
}

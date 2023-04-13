public class Lennuk extends S6iduk implements Andmed{
    public Lennuk(String mark, int kaal, int v6imsus, int hind) {
        super(mark, kaal, v6imsus, hind);
    }

    @Override
    public String getV6imsus() {
        float suhe = this.v6imsus / this.kaal;
        if (suhe > 1){
            return "Tegu on reaktiivlennukiga!";
        }   else{
            return "Tegu on tavalise lennukiga!";
        }
    }

    @Override
    public String getHind() {
        if (this.hind > 500000){
            return "Lennuk on kallis!";
        }   else{
            return "Lennuki hind on keskpärane!";
        }
    }
}

public class Auto extends S6iduk implements Andmed {

    public Auto(String mark, int kaal, int v6imsus, int hind) {
        super(mark, kaal, v6imsus, hind);
    }

    @Override
    public String getV6imsus() {
        float suhe = this.v6imsus / this.kaal;
        if (suhe > 0.1){
            return "Auto on väga võimas!";
        }   else{
            return "Auto on lahja!";
        }
    }

    @Override
    public String getHind() {
        if (this.hind > 30000){
            return "Auto on kallis!";
        }   else{
            return "Auto hind on keskpärane!";
        }
    }


}

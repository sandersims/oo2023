import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {

    @Test
    public void kontrolli_kas_auto_on_lahja_kui_v6imsus_on_70_ja_kaal_1700() {
        Auto auto = new Auto("Peugeot", 1700, 70, 10000);
        assertEquals("Auto on lahja!", auto.getV6imsus());
    }

    @Test
    public void kontrolli_kas_auto_hind_on_keskp2rane_kui_hind_on_10000() {
        Auto auto = new Auto("Peugeot", 1700, 70, 10000);
        assertEquals("Auto hind on keskpärane!", auto.getHind());
    }

    @Test
    public void kontrolli_kas_mootorrattas_on_v6imas_kui_v6imsus_on_147_ja_kaal_on_200() {
        Mootorrattas mootorrattas = new Mootorrattas("Kawasaki ninja H2", 200, 147, 25000);
        assertEquals("Mootorrattas on väga võimas!", mootorrattas.getV6imsus());
    }

    @Test
    public void kontrolli_kas_mootorrattas_on_kallis_kui_hind_on_25000() {
        Mootorrattas mootorrattas = new Mootorrattas("Kawasaki ninja H2", 200, 147, 25000);
        assertEquals("Mootorrattas on kallis!", mootorrattas.getHind());
    }

    @Test
    public void kontrolli_kas_lennuk_on_v6imas_kui_v6imsus_on_100000_ja_kaal_on_20000() {
        Lennuk lennuk = new Lennuk("F-22", 20000, 100000, 200000000);
        assertEquals("Tegu on reaktiivlennukiga!", lennuk.getV6imsus());
    }

    @Test
    public void kontrolli_kas_lennuk_on_kallis_kui_hind_on_200000000() {
        Lennuk lennuk = new Lennuk("F-22", 20000, 100000, 200000000);
        assertEquals("Lennuk on kallis!", lennuk.getHind());
    }

}

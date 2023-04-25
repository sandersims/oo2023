package ee.sander.kodutoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MootorrattadController {
    Mootorratas mootorrattad = new Mootorratas(1,"Kawasaki ninja h2", 30000, true);

    @GetMapping("mootorratas")
    public Mootorratas saaMootorrattad() {
        return mootorrattad;
    }

    @GetMapping("kustuta-mootorratas")
    public String kustutaMootorrattas() {
        mootorrattad = null;
        return "Edukalt kustutatud!";
    }

    @GetMapping("muuda-aktiivsust")
    public Mootorratas muudaAktiivsust() {
        mootorrattad.setAktiivne( !mootorrattad.isAktiivne() );
        return mootorrattad;
    }
}
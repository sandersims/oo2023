package ee.sander.uuskodutoo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MootorratasController {
    Mootorratas mootorratas = new Mootorratas(1,"BMW", 30000, true);
    @GetMapping("mootorratas")
    public Mootorratas saaMootorratas() {
        return mootorratas;
    }

    @GetMapping("kustuta-mootorratas")
    public String kustutaMootorratas() {
        mootorratas = null;
        return "Edukalt kustutatud!";
    }
    @GetMapping("suurenda-hinda")
    public Mootorratas suurendaHinda() {
        mootorratas.setHind( mootorratas.getHind()+1 );
        return mootorratas;
    }
    @GetMapping("muuda-aktiivsust")
    public Mootorratas muudaAktiivsust(){
        mootorratas.setAktiivne(!mootorratas.isAktiivne());
        return mootorratas;
    }
}

package ee.sander.uuskodutoo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MootorratasListController {
    List<Mootorratas> mootorrattad = new ArrayList<>(Arrays.asList(
            new Mootorratas(1,"Kawasaki", 18000, true),
            new Mootorratas(2,"Yamaha", 20000, true),
            new Mootorratas(3,"Ducati", 30000, true)
    ));
    @GetMapping("mootorrattad")
    public List<Mootorratas> saaMootorattad() {
        return mootorrattad;
    }
    @GetMapping("kustuta-mootorattas/{index}")
    public String kustutaMootorratas(@PathVariable int index) {
        mootorrattad.remove(index);
        return "Toode kustutatud!";
    }
    @GetMapping("lisa-mootorattas/{id}/{nimi}/{hind}/{aktiivne}")
    public List<Mootorratas> lisaMootorratas(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable boolean aktiivne) {
        mootorrattad.add(new Mootorratas(id, nimi, hind, aktiivne));
        return mootorrattad;
    }
}

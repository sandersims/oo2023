package ee.sander.kodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MootorrattadListController {
    List<Mootorrattad> mootorrattad = new ArrayList<>(Arrays.asList(
            new Mootorrattad(1,"Kawasaki ninja h2", 30000, true),
            new Mootorrattad(2,"BMW S1000RR", 25000, true),
            new Mootorrattad(3,"Yamaha R1M", 27500, true)
    ));

    @GetMapping("mootorrattad")
    public List<Mootorrattad> saaMootorrattad() {
        return mootorrattad;
    }

    @GetMapping ("kustuta-mootorratas/{index}")
    public String kustutaMootoratas(@PathVariable int index) {
        mootorrattad.remove(index);
        return "Mootorratas kustutatud!";
    }

    @GetMapping("lisa-mootorratas")
    public List<Mootorrattad> lisaMootorratasURLParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind,
            @RequestParam boolean aktiivne) {
        mootorrattad.add(new Mootorrattad(id, nimi, hind, aktiivne));
        return mootorrattad;
    }
    // localhost:8080/lisa-toode?id=8&nimi=Mullivesi&hind=2.3&aktiivne=true
}


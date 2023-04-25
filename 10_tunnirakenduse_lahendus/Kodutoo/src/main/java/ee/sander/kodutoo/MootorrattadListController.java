package ee.sander.kodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MootorrattadListController {
    List<Mootorratas> mootorrattad = new ArrayList<>(Arrays.asList(
            new Mootorratas(1,"Kawasaki ninja h2", 30000, true),
            new Mootorratas(2,"BMW S1000RR", 25000, true),
            new Mootorratas(3,"Yamaha R1M", 27500, true)
    ));

    @GetMapping("mootorrattad")
    public List<Mootorratas> saaMootorrattad() {
        return mootorrattad;
    }

    @GetMapping ("kustuta-mootorratas/{index}")
    public String kustutaMootoratas(@PathVariable int index) {
        mootorrattad.remove(index);
        return "Mootorratas kustutatud!";
    }

    @GetMapping("lisa-mootorratas")
    public List<Mootorratas> lisaMootorratasURLParameetritega(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double hind,
            @RequestParam boolean aktiivne) {
        mootorrattad.add(new Mootorratas(id, nimi, hind, aktiivne));
        return mootorrattad;
    }
}


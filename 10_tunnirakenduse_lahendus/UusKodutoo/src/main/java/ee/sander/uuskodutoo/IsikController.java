package ee.sander.uuskodutoo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class IsikController {
    List<Isik> isikud = new ArrayList<>(Arrays.asList(
            new Isik(1,"Üllar" ,"Kukeke", new Date()),
            new Isik(2,"Karl" ,"Suur", new Date()),
            new Isik(3,"Ervin" ,"Lillepea", new Date())
    ));
    @GetMapping("isikud")
    public List<Isik> saaIsikud() {
        return isikud;
    }

    @DeleteMapping("kustuta-isik/{index}")
    public String kustutaToode(@PathVariable int index) {
        isikud.remove(index);
        return "Toode kustutatud!";
    }

    @PostMapping("lisa-isik")
    public List<Isik> lisaIsikURLParameetritega(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam double hind) {
        isikud.add(new Isik(id, eesnimi, perenimi, new Date()));
        return isikud;
    }

}

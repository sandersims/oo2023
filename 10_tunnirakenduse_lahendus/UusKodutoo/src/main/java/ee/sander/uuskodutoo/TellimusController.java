package ee.sander.uuskodutoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class TellimusController {
    @Autowired
    MootorratasListController mootorratasListController;
    @Autowired
    IsikController isikController;
    List<Mootorratas> tellitudMootorrattad = new ArrayList<>(Arrays.asList(
            new Mootorratas(1,"Ducati", 35000,true),
            new Mootorratas(2,"Honda", 15000, true)
    ));

    Isik tellija = new Isik(1, "Sander", "Sims", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellitudMootorrattad)
    ));
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaMootorratas(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }

    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaMootorratas(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam int tooteIndex) {

        Isik tellija = isikController.isikud.get(tellijaIndex);

        Mootorratas tellitudMootorratas = mootorratasListController.mootorrattad.get(tooteIndex);
        List<Mootorratas> tellitudmootorrattad = new ArrayList<>(Arrays.asList(tellitudMootorratas));

        tellimused.add(new Tellimus(id, tellija, tellitudmootorrattad));
        return tellimused;
    }

}

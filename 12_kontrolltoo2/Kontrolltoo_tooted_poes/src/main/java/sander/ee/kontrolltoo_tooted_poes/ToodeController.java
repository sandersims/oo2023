package sander.ee.kontrolltoo_tooted_poes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeController {
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Kartul", 2, 0.0, 10),
            new Toode(2, "Sibul", 3, 0.1, 5),
            new Toode(3, "Tomat", 1, 0.9, 20),
            new Toode(4, "Kurk", 4, 0.05, 15))

    );

    @GetMapping("lisa-toode")
    public List<Toode> lisaToode(
            @RequestParam int id,
            @RequestParam String nimetus,
            @RequestParam double hind,
            @RequestParam double allahindlus,
            @RequestParam int kogus
    ) {
        tooted.add(new Toode(id, nimetus, hind, allahindlus, kogus));
        return tooted;
    }

    @GetMapping("leia-allahindlus")
    public List<Toode> leiaAllahindlus() {
        List<Toode> filteredTooted = new ArrayList<>();
        for (Toode toode : tooted) {
            if (toode.getAllahindlus() > 0.0) {
                filteredTooted.add(toode);
            }
        }
        return filteredTooted;
    }
}

package sander.ee.kontrolltoo_tooted_poes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PoodController {
    @Autowired
    ToodeController toodeController;

    List<Toode> MaximaTooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Kartul", 2, 0.0, 10),
            new Toode(2, "Sibul", 3, 0.1, 5),
            new Toode(3, "Tomat", 1, 0.9, 20),
            new Toode(4, "Kurk", 4, 0.05, 15))

    );

    List<Toode> GrossiTooted = new ArrayList<>(Arrays.asList(
            new Toode(0, "Sai", 2, 0.2, 100),
            new Toode(1, "Laua viin", 3, 0.45, 25),
            new Toode(2, "Piim", 1, 0.05, 50),
            new Toode(3, "Hapukoor", 4, 0.1, 65)
    ));

    List<Pood> poed = new ArrayList<>(Arrays.asList(
            new Pood(0,"Maxima", MaximaTooted),
            new Pood(1, "Grossi", GrossiTooted)
    ));

    @GetMapping("poed")
    public List<Pood> saaPoed(){
        return poed;
    }

    @GetMapping("lisa-pood")
    public List<Pood> lisaPoed(
            @RequestParam int id,
            @RequestParam String nimetus,
            @RequestParam int[] tooteId) {

        List<Toode> tooted = new ArrayList<>();
        for (int i: tooteId) {
            Toode toode = toodeController.tooted.get(i);
            tooted.add(toode);
        }
        poed.add(new Pood(id, nimetus, tooted));
        return poed;
    }

    @GetMapping("leia-pood")
    public Pood saaPood(
            @RequestParam int id
    ) {
        for (Pood pood : poed) {
            if (pood.getId() == id) {
                return pood;
            }
        }
        return null;
    }

}

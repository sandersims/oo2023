package ee.sander.uuskodutoo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mootorratas {
    private int id;
    private String nimi;
    private double hind;
    private boolean aktiivne;
}

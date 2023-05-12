package sander.ee.kontrolltoo_tooted_poes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Toode {
    @Id
    private int id;

    private String nimetus;
    private double hind;
    private double allahindlus;
    private int kogus;
}

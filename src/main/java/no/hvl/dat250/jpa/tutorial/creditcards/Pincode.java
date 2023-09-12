package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Pincode {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    @Getter
    private Integer count;

    public String getCode() {
        return pincode;
    }
}

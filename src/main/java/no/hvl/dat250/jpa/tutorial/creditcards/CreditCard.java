package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private Integer number;
    @Getter
    private Integer balance;
    @Getter
    private Integer creditLimit;

    @ManyToOne
    private Bank bank;

    @Getter
    @ManyToOne
    private Pincode pincode;

    public Bank getOwningBank() {
        return bank;
    }
}

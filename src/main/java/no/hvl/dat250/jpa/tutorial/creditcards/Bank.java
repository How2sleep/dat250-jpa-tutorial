package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import java.util.Collection;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "bank")
    private final Collection<CreditCard> creditCards = null;

    public Long getId() {
        return id;
    }

    public String getName() {
        // TODO: implement method!
        return name;
    }

    public Collection<CreditCard> getOwnedCards() {
        // TODO: implement method!
        return creditCards;
    }
}

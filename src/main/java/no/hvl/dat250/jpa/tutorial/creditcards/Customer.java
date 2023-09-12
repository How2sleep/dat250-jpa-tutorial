package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.Collection;
import jakarta.persistence.*;
import lombok.Getter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    private String name;

    @Getter
    @ManyToMany
    private final Collection<Address> addresses = null;

    @OneToMany(mappedBy = "customer")
    private final Collection<CreditCard> creditcards = null;

    public Collection<CreditCard> getCreditCards() {
        return creditcards;
    }
}

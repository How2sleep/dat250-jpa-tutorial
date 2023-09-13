package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bank {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @OneToMany(mappedBy = "bank")
    private Set<CreditCard> creditCards = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CreditCard> getOwnedCards() {
        return creditCards;
    }

    public void setCreditCards(HashSet creditCards) {
        this.creditCards = creditCards;
    }
    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }
}

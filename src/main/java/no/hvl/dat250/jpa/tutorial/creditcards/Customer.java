package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    @ManyToMany(mappedBy = "owners")
    private Set<Address> addresses = new HashSet<>();

    @ManyToMany
    private Set<CreditCard> CreditCards = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(HashSet addresses) {
        this.addresses = addresses;
    }
    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Set<CreditCard> getCreditCards() {
        return CreditCards;
    }

    public void setCreditCards(HashSet<CreditCard> creditCards) {
        CreditCards = creditCards;
    }
    public void addCreditCard(CreditCard creditCard) {
        CreditCards.add(creditCard);
    }
}







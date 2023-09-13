package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;


    @ManyToMany(targetEntity = Address.class)
    private Collection<Address> addresses = new ArrayList<>();

    @OneToMany
    private Collection<CreditCard> CreditCards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Collection<Address> addresses) {
        this.addresses = addresses;
    }
    public void addAddress(Address address) {
        addresses.add(address);
    }

    public Collection<CreditCard> getCreditCards() {
        return CreditCards;
    }

    public void setCreditCards(Collection<CreditCard> creditCards) {
        CreditCards = creditCards;
    }
    public void addCreditCard(CreditCard creditCard) {
        CreditCards.add(creditCard);
    }
}







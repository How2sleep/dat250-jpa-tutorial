package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setCreditLimit(Integer creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }
}

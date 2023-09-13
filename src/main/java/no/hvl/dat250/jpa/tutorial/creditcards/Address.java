package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.*;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private Integer number;



    @ManyToMany
    private Set<Customer> owners =new HashSet<>();

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Set<Customer> getOwners() {
        return owners;
    }

    public void setOwners(HashSet<Customer> owners) {
        this.owners = owners;
    }
    public void addOwner(Customer customer) {
        owners.add(customer);
    }
}

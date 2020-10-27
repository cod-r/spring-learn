package com.example.demo.entity;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(generator = "address_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "address_gen", sequenceName = "address_seq", allocationSize = 1)

    private Long id;

    private String streetName;

    private Long streetNumber;

    private Long fk_person;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Long getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Long streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Long getFk_person() {
        return fk_person;
    }

    public void setFk_person(Long fk_person) {
        this.fk_person = fk_person;
    }
    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", fk_person='" + fk_person + '\'' +
                '}';
    }

}

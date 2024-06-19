package jpabook.jpashop.domain;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcoce;

    protected Address(){}

    public Address(String city, String street, String zipcoce) {
        this.city = city;
        this.street = street;
        this.zipcoce = zipcoce;
    }
}

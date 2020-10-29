package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    AddressRepository addressRepository;

    @Test
    void deleteAddress() {
        Optional<Address> streetName = addressRepository.findByStreetName("Rozei");

        if (streetName.isPresent()) {
            addressRepository.delete(streetName.get());
            System.out.println("The row containing the street name was deleted from Address");
        } else {
            System.out.println("Could not find the address");
        }

    }

}
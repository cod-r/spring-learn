package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.entity.Person;
import com.example.demo.repository.AddressRepository;
import com.example.demo.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired PersonRepository personRepository;

	@Test
	void addPerson() {
		Person ionel = new Person();
		ionel.setFirstName("Gigi");
		ionel.setLastName("Contra");
		ionel.setAge(42L);
		ionel.setGender("male");

		personRepository.save(ionel);
	}

	@Autowired AddressRepository addressRepository;

	@Test
	void addAddress() {
		Address address = new Address();
		address.setStreetName("Rozei");
		address.setStreetNumber(21L);
		address.setFk_person(5L);

		addressRepository.save(address);
	}
}

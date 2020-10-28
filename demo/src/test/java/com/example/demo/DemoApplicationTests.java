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
		ionel.setFirstName("Ionel");
		ionel.setLastName("Popescu");
		ionel.setAge(25L);
		ionel.setGender("male");

		personRepository.save(ionel);
	}

	@Autowired AddressRepository addressRepository;

	@Test
	void addAddress() {
		Address address = new Address();
		address.setStreetName("Jiul");
		address.setStreetNumber(6L);
		address.setFk_person(1L);

		addressRepository.save(address);
	}
}

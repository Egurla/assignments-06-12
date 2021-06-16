package com.nisum.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nisum.customexpn.AddressIsNullExcetion;
import com.nisum.model.Person;

public class PersonData {

	public static List<Person> getPersonDataUsingJava7(List<Person> list) {

		List<Person> listOfPersons = new ArrayList<Person>();

		for (Person person : list) {
			if (person.getAddress() == null) {
				throw new AddressIsNullExcetion("could not find address for " + person.getFirstname());
			}
			if (person.getAddress().getState().equals("TELANGANA")) {
				listOfPersons.add(person);
			}
		}
		return listOfPersons;
	}

	// Using Java8
	public static List<Person> getPersonDataUsingJava8(List<Person> list) {
		for (Person person : list) {
			if (person.getAddress() == null) {
				throw new AddressIsNullExcetion("could not find address for " + person.getFirstname());
			}
		}
		List<Person> listOfpers = list.stream().filter(x -> x.getAddress().getState().equals("TELANGANA"))
				.collect(Collectors.toList());
		return listOfpers;
	}

}

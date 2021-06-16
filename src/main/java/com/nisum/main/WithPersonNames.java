package com.nisum.main;

import java.util.List;

import com.nisum.customexpn.AddressIsNullExcetion;
import com.nisum.model.Person;

public class WithPersonNames {

	public static boolean getNameUsingJava7(List<Person> listofpersons) {

		for (Person person : listofpersons) {
			if (listofpersons != null && person.getFirstname().equals("RAM")) {
				System.out.println(person.getFirstname());
				return true;
			}

		}
		return false;
	}

	public static boolean getNameUsingJava8(List<Person> listofpersons) {

		for (Person person : listofpersons) {
			if (person.getAddress() == null) {
				throw new AddressIsNullExcetion("could not find address for " + person.getFirstname());
			}
		}
		return listofpersons.stream().filter(x -> x.getFirstname().equals("RAM")) != null;

	}

}

package com.victor.streams.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class MappingObjects implements Exercise {

	@Override
	public void run() throws Exception {
		// Create a stream of NamePhoneAddress
		List<NamePhoneAddress> namePhoneAddressList = new ArrayList<NamePhoneAddress>(List.of(
				new NamePhoneAddress("Victor", "111", "Netherlands"),
				new NamePhoneAddress("Leonardo", "222", "Eindhoven"), new NamePhoneAddress("Alvaro", "333", "Brazil")));

		// Map the list to a Stream os NameAddress
		Stream<NameAddress> nameAddressStream = namePhoneAddressList.stream()
				.map(e -> new NameAddress(e.getName(), e.getAddress()));

		// Display the Stream's content
		nameAddressStream.forEach(e -> System.out.println(e.getName() + " : " + e.getAddress()));
	}
}

class NamePhoneAddress {
	public String name;
	public String phone;
	public String address;

	public NamePhoneAddress(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getAddress() {
		return this.address;
	}
}

class NameAddress {
	public String name;
	public String address;

	public NameAddress(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}
}

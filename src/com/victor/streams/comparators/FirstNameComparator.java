package com.victor.streams.comparators;

import java.util.Comparator;

import com.victor.streams.entity.Employee;

public class FirstNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		String employee1Firstname = o1.getFullName().substring(0, o1.getFullName().lastIndexOf(" "));
		String employee2Firstname = o2.getFullName().substring(0, o2.getFullName().lastIndexOf(" "));

		return employee1Firstname.compareTo(employee2Firstname);
	}
}

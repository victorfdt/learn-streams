package com.victor.streams.comparators;

import java.util.Comparator;

import com.victor.streams.entity.Employee;

public class LastNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		int indexE1 = e1.getFullName().lastIndexOf(" ");
		int indexE2 = e2.getFullName().lastIndexOf(" ");

		int result = e1.getFullName().substring(indexE1).compareTo(e2.getFullName().substring(indexE2));
		return result;
	}
}

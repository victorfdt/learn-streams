package com.victor.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.victor.streams.comparators.FirstNameComparator;
import com.victor.streams.comparators.LastNameComparator;
import com.victor.streams.entity.Employee;
import com.victor.streams.interfaces.Exercise;

public class LastNameThenFirstNameExample implements Exercise {

	@Override
	public void run() {
		// data source
		List<Employee> listEmployee = new ArrayList<>(List.of(new Employee("Victor A", 100),
				new Employee("Victor B", 100), new Employee("Leonardo C", 100),
				new Employee("Leonardo A", 100), new Employee("Leonardo B", 100)));
		
		// create a stream
		Stream<Employee> myStream = listEmployee.stream();
		
		// create the combined Comparator: lastNameThenFirstName
		LastNameComparator lastNameComparator = new LastNameComparator();
		
		
		Comparator<Employee> lastNameThenFirstName = lastNameComparator.thenComparing(new FirstNameComparator());
		
		// sort the stream using the combined comparator
		Stream<Employee> mySortedStream = myStream.sorted(lastNameThenFirstName);
		
		// display the result
		mySortedStream.forEach(e -> System.out.println(e.getFullName()));
	}
}

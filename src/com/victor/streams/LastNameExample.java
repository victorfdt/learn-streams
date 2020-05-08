package com.victor.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.victor.streams.comparators.LastNameComparator;
import com.victor.streams.entity.Employee;
import com.victor.streams.interfaces.Exercise;

public class LastNameExample implements Exercise {

	public void run() {

		// data source
		List<Employee> listEmployee = new ArrayList<>(List.of(new Employee("Victor Trani", 100),
				new Employee("Lucas Moreton", 100), new Employee("Leonardo Kenup", 100),
				new Employee("Goreti Forato", 100), new Employee("Alvaro Santos", 100)));

		// create the stream
		Stream<Employee> myStream = listEmployee.stream();
		
		// sort using the CorpoConstructor
		Stream<Employee> sortedStream = myStream.sorted(new LastNameComparator());
		
		// display the result
		System.out.println("Sorting by last name");
		sortedStream.forEach(e -> System.out.println("Employee: "+ e.getFullName()));

	}

}

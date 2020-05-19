package com.victor.streams.mapping;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import com.victor.streams.interfaces.Exercise;

public class MappingOperation implements Exercise {

	public void run() {
		// data source: generate a Stream of Double
		System.out.println("Generate 50 random Double values");
		DoubleStream.generate(() -> Math.random()).limit(50).forEach(e -> System.out.println(e));

		System.out.println();

		// transform data using map
		System.out.println("1- Using Map to transform the data and sum 1 to the double");
		DoubleStream mappedStream = DoubleStream.generate(() -> Math.random()).limit(50).map(x -> x + 1);
		mappedStream.forEach(e -> System.out.println(e));

		System.out.println();

		System.out.println("Using flapMap");
		List<Integer> list1 = List.of(1, 2, 3);
		List<Integer> list2 = List.of(4, 5, 6);
		List<Integer> list3 = List.of(7, 8, 9);

		// Create my list of list
		System.out.println("Create a List of Lists. List<List<Integer>>");
		System.out.println("The flapMap has the capability to convert a Collection<Collection<T>> to Collection<T>");
		System.out.println("Before flapping: ");
		List<List<Integer>> listOfList = List.of(list1, list2, list3);
		System.out.println(listOfList);
		
		System.out.println();
		System.out.println("After flapping:");
		listOfList = List.of(list1, list2, list3);
		System.out.println(listOfList.stream().flatMap(x -> x.stream()).collect(Collectors.toList()).toString());
	}

}

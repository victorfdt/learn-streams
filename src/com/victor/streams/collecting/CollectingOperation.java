package com.victor.streams.collecting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class CollectingOperation implements Exercise {

	@Override
	public void run() throws Exception {
		System.out.println("Collection Operations");

		// Data source: generate a Stream
		Stream<String> myStream = List.of("Victor", "Leonardo", "Lucas").stream();

		// Retrieve a list from the Stream using
		System.out.println("Retrieve a list from the Stream using the collect() method with Collectors.toList()");
		List<String> myStringList = myStream.collect(Collectors.toList());

		// Display the result
		myStringList.forEach(e -> System.out.println(e));

		// Data source: generate a DoubleStream
		DoubleStream myDoubleStream = DoubleStream.generate(Math::random).limit(10);

		// Retrieve the List from the Stream
		System.out.println("Retrieve a lista from the DoubleStream using the collect() method and my own functions");
		List<Double> myDoubleList = myDoubleStream.collect(ArrayList::new, (list, element) -> list.add(element),
				(listA, listB) -> listA.addAll(listB));

		// Display the result
		myDoubleList.forEach(e -> System.out.println(e));
		
		// Another approach
		System.out.println();
		System.out.println("Another approach");
		myDoubleStream = DoubleStream.generate(Math::random).limit(10);
		List<Double> myDoubleList2 = myDoubleStream.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		myDoubleList2.forEach(e -> System.out.println(e));
		

	}

}

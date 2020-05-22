package com.victor.streams.search;

import java.util.Arrays;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class SearchOperation implements Exercise {

	@Override
	public void run() throws Exception {
		// data source
		String[] myArray = new String[] { "Stoel", "Tafelkleed", "Tafel" };

		// getting the stream
		Stream<String> myStream = Arrays.stream(myArray);

		// Find the first element using findFirst
		System.out.println("show the first element using findFirst: " + myStream.findFirst().get());

		// Find using findAny. The behavior of this operation is explicitly
		// nondeterministic.
		myStream = Arrays.stream(myArray);
		System.out.println("show any element using findAny: " + myStream.findAny().get());

		// Return a boolean based on the given Predicate. It will spot and return
		// true when the first match occur.
		myStream = Arrays.stream(myArray);
		System.out.println("Check if there is a match with anyMatch");
		System.out.println("Return a boolean with the value of the result of a given Predicate: "
				+ myStream.peek(e -> System.out.println(e)).anyMatch(s -> s.length() > 5));

		// Return a boolean depending of the Predicate. It return true if all elements
		// were evaluated and return true
		myStream = Arrays.stream(myArray);

		System.out.println("Using allMa to check if all elements matchs");
		System.out.println(myStream.allMatch(x -> !x.isBlank()));
		
		// Return true if none of the elements matches the given Predicate
		System.out.println("Return true if none of the elements matches the given Predicate");
		myStream = Arrays.stream(myArray);
		
		System.out.println(myStream.noneMatch(x -> x.isBlank()));
		

	}

}

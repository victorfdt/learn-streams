package com.victor.streams;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class Question1 implements Exercise {

	public void run() {
		// Source of data: List.
		var myList = Arrays.asList(1, 3, 5, 2, 4);

		// Obtain the stream.
		Stream<Integer> myStream = myList.stream();

		// Obtain the minimum value.
		Optional<Integer> minVal = myStream.min(Integer::compareTo);

		// Check if the value is present.
		if (!minVal.isEmpty()) {
			System.out.println("The value is present: " + minVal.get());
		} else {
			minVal.orElseThrow();
		}
		
		// The min method is a terminal operation. So, it consumes the stream and I
		// can no longer use the stream myStream.
		// Optional<Integer> maxVal = myStream.max(Integer::compareTo); ->
		// java.lang.IllegalStateException: stream has already been operated upon or closed		
		// I need to assign the stream again
		myStream = myList.stream();

		// Sort the stream, which results in a sorted stream
		Stream<Integer> sortedStream = myStream.sorted();

		// Output the sorted stream
		myStream.forEach(i -> System.out.print(i + " "));

		System.out.println();
		// Display only odd numbers
		// TODO question1: why do I get an exception if the sorted() method in an
		// intermediate operation?
		//sortedStream.forEach(i -> System.out.print(i + " "));
	}

}

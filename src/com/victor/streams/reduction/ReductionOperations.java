package com.victor.streams.reduction;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class ReductionOperations implements Exercise {

	public void run() {

		// data source
		System.out.println("Streams - Reduction operation");
		List<String> names = List.of("Victor", "Leonardo", "Lucas");

		// get the stream
		Stream<String> myStream = names.stream();

		// count the number of elements
		System.out.println("Using count to count the number of elements");
		System.out.println(myStream.count());
		System.out.println();

		myStream = names.stream();

		// reduce the stream
		System.out.println("1- Using Optional reduce()");
		
		Optional<String> reduced = myStream.reduce((a, b) -> {
			System.out.println("a:" + a);
			System.out.println("b:" + b);
			return a.concat(b);
		});

		// show if present
		if (reduced.isPresent()) {
			System.out.println(reduced.get());
			System.out.println();
		}
		
		myStream = names.stream();

		System.out.println("2- Using T reduce()");
		//TODO how does it work? Why is it 
		String result = myStream.reduce("111", (a,b) -> a.concat(b));
		System.out.println(result);
		System.out.println();
	}
}

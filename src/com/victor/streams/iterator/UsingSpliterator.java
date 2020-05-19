package com.victor.streams.iterator;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class UsingSpliterator implements Exercise {

	@Override
	public void run() throws Exception {
		// Data source
		List<String> listNames = List.of("Victor", "Leonardo", "Lucas");
		
		// Get the Stream
		Stream<String> myStream = listNames.parallelStream();
		
		// Obtain a Spliterator
		System.out.println("Creating a Spliterator from a Stream");
		Spliterator<String> mySpliterator = myStream.spliterator();
		
		// Iterator trough the elements
		System.out.println("1- Iterating through the elements using tryAdvance() method from Spliterator");
		while(mySpliterator.tryAdvance(e -> System.out.print(e + " ")));
		
		// Since the spliterator() is a terminal operation, I need to re-sign the stream
		System.out.println("");
		System.out.println("");
		System.out.println("Since the spliterator() is a terminal operation, I need to re-sign the stream and the spliterator");
		
		myStream = listNames.parallelStream();
		mySpliterator = myStream.spliterator();
		
		
		// Iterate trough the elements
		System.out.println("2- Iterating through the elements using forEachRemaining() method from Spliterator");
		mySpliterator.forEachRemaining(e -> System.out.print(e + " "));
		
		System.out.println("");
		System.out.println("");
		
		myStream = listNames.parallelStream();
		mySpliterator = myStream.spliterator();
		
		System.out.println("3- Iterating through the elements using trySplit() method from Spliterator");
		// Split the first iterator
		Spliterator<String> mySpliterator2 = mySpliterator.trySplit();
		
		// If it is possible to split the spliterator, then use the second one
		if(mySpliterator2 != null) {
			System.out.println("Output from mySpliterator2:");
			mySpliterator2.forEachRemaining(e -> System.out.println(e + " "));
		}
		
		System.out.println("Output from mySpliterator:");
		mySpliterator.forEachRemaining(e -> System.out.println(e + " "));
		
		
	}
}

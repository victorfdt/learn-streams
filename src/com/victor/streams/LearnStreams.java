package com.victor.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import com.victor.streams.comparators.MyComparator;
import com.victor.streams.comparators.MyReverseComparator;
import com.victor.streams.interfaces.Exercise;

public class LearnStreams implements Exercise {

	public void run() {

		// data source
		var myStringArray = new String[] { "Leonardo", "Lucas", "Victor" };

		// create a Stream from an array
		Stream<String> myStream = Arrays.stream(myStringArray);

		// 1- sort the stream
		Stream<String> sortedStream = myStream.sorted();

		// display the result
		System.out.println("1- Sort the stream with myStream.sorted()");
		sortedStream.forEach((String name) -> {
			System.out.print(name + " ");
		});
		
		// Since the forEach is a terminal operation. I will re-assign the stream
		myStream = Arrays.stream(myStringArray);
		//myStream = Arrays.stream(new String[] {});

		// 2- NOTE: an intermediate operation returns a Stream and a terminal operation a Optional.
		// The terminal operation can return nothing (void) or the Optional class.
		Optional<String> maxValue = myStream.max(String::compareTo);
		
		// Check if there is a value
		if(maxValue.isPresent()) {
			
			// The maxValue was obtained lexicographically
			System.out.println("2- Use the max method");
			System.out.println(maxValue.get());
		} else {
			maxValue.orElseThrow();
		}		

		// Since the forEach is a terminal operation. I will re-assign the stream
		Arrays.stream(myStringArray)
			.filter(name -> name.length() <= 5)
			.forEach(name -> System.out.print(name + " "));

		// 3- Using filter. Get a name which has less and equal 5 characters. I need to provide a Predicate
		Stream<String> nameLessThan5Chars = myStream.filter(name -> name.length() <= 5);

		// display the result
		nameLessThan5Chars.forEach(name -> System.out.print(name + " "));

		System.out.println();

		// 4- Using my own Comparator
		// Create the data source from a Set
		Set<String> ts1 = new TreeSet<String>(new MyReverseComparator());

		ts1.add("A");
		ts1.add("F");
		ts1.add("X");
		ts1.add("I");
		ts1.add("P");
		ts1.add("U");

		myStream = ts1.stream();
		myStream.forEach(letter -> System.out.print(letter + ""));

		System.out.println();
		// 5- Another approach: using the method reversed()
		// MyReverseComparator());
		//This approach is not clear about the order.
		TreeSet<String> ts2 = new TreeSet<>(new MyComparator().reversed());

		ts2.add("A");
		ts2.add("F");
		ts2.add("X");
		ts2.add("I");
		ts2.add("P");
		ts2.add("U");

		myStream = ts2.stream();
		myStream.forEach(letter -> System.out.print(letter + ""));

		System.out.println();
		// 6- Another approach: create my own comparator via lambda expressions. Is Comparator a BiFunction<String,String,Integer?
		TreeSet<String> tsLambda = new TreeSet<>((l1, l2) -> l2.compareTo(l1));
		
		List<String> myList = List.of("A","F","X","I","P","U");

		for (String s : tsLambda) {
			System.out.print(s);
		}
	}
}

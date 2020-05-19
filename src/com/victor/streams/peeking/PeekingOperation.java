package com.victor.streams.peeking;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class PeekingOperation implements Exercise {

	public void run() {
		System.out.println("PeekingOperation");
		// data source
		double[] myArray = new double[] { 1.0, (double) 2, 3.0 };

		// create the stream
		DoubleStream myStream = Arrays.stream(myArray);

		// peek: it returns a stream containing the elements of the stream, additionally
		// performing an action.
		// API NOTE: This method exists mainly to support debugging, where you want to
		// see the elements as they flow past a certain point in a pipeline:

		// interesting: The code below does not work, because it is causing
		// "interference".
		// which means, that it is changing the data source and it is not allowed.
		// myStream.peek(e -> e += 1.0).forEach(e -> System.out.println(e));

		// TODO: Why it does not execute the sout?
		System.out.println("Using peek with count");
		long value = Stream.of(1, 2, 3, 4, 5).peek(System.out::println).count();
		
		System.out.println("Using peek with collect");
		List<Integer> list = Stream.of(1, 2, 3, 4, 5).peek(System.out::println).collect(Collectors.toList());

		
	}

}

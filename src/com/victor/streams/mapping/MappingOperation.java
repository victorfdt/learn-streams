package com.victor.streams.mapping;

import java.util.stream.DoubleStream;

import com.victor.streams.interfaces.Exercise;

public class MappingOperation implements Exercise {

	public void run() {
		// data source: generate a Stream of Double
		System.out.println("Generate 50 random Double values");
		DoubleStream.generate(() -> Math.random()).limit(50).forEach(e -> System.out.println(e));

		System.out.println();
		
		// transform data using map
		System.out.println("Using Map to transform the data and sum 1 to the double");
		DoubleStream mappedStream = DoubleStream.generate(() -> Math.random()).limit(50).map(x -> x + 1);
		mappedStream.forEach(e -> System.out.println(e));
		
		System.out.println();
		
		System.out.println("Using method mapToInt");
		
	}

}

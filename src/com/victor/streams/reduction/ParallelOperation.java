package com.victor.streams.reduction;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.victor.streams.interfaces.Exercise;

public class ParallelOperation implements Exercise {

	public void run() {
		// data source
		List<Integer> myList = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		
		// get the parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();
		
		// showing 
		System.out.println("");
		parallelStream.forEachOrdered(e -> System.out.println(e));
		//parallelStream.forEach(e -> System.out.println(e));

	}

}

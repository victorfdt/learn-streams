package com.victor.streams.reduction;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import com.victor.streams.interfaces.Exercise;

public class CustomParallelOperation implements Exercise {

	public void run() throws InterruptedException, ExecutionException {
		long firstNum = 1;
		long lastNum = 1_000_000;

		// data source
		// .rangeClosed(): create a range of elements from the firstNum to the lastNum
		// .boxed: it will return the elements boxed to Long
		// .collect(): define how to collect the Stream. I need to inform the collector type.
		List<Long> aList = LongStream.rangeClosed(firstNum, lastNum).boxed().collect(Collectors.toList());

		ForkJoinPool customThreadPool = new ForkJoinPool(4);
		long actualTotal = customThreadPool.submit(() -> aList.parallelStream().reduce(0L, Long::sum)).get();

		long expectedResult = (lastNum + firstNum) * lastNum / 2;

		if (expectedResult == actualTotal) {
			System.out.println("Correct!");
		}
	}

}
